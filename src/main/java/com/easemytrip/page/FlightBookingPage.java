package com.easemytrip.page;
import java.time.Duration;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlightBookingPage extends Base {
    private WebDriver driver;
    public void setup() {
        driver = new ChromeDriver();
        driver.get(getTest("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public boolean flightPageIsPresent() {

        WebElement flightTab = driver.findElement(By.xpath("//div[@id='myTopnav']/div[1]/ul/li[1]/a"));
        return flightTab.isDisplayed();
    }

    public boolean oneWayTripIsPresentAndEnabled() {

        WebElement oneWayTrip = driver.findElement(By.id("oway"));
        return oneWayTrip.isDisplayed() && oneWayTrip.isEnabled();
    }

    public boolean roundTripIsPresentAndEnabled() {

        WebElement roundTrip = driver.findElement(By.id("rtrip"));
        return roundTrip.isDisplayed() && roundTrip.isEnabled();
    }

    public boolean multiCityIsPresentAndEnabled() {

        WebElement multiCity = driver.findElement(By.id("mcity"));
        return multiCity.isDisplayed() && multiCity.isEnabled();
    }

    public boolean searchFlightsAvailable() {
        // Enter the source city
        try {
            driver.findElement(By.id("FromSector_show")).click();
            driver.findElement(By.id("a_FromSector_show")).sendKeys(getTest("from"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.xpath("//*[@id=\"fromautoFill\"]/ul/li[2]")).click();

            // Enter the destination city
            driver.findElement(By.id("a_Editbox13_show")).sendKeys(getTest("destination"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.xpath("//*[@id=\"toautoFill\"]/ul/li")).click();

            // Select the departure date
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.id("fiv_2_26/12/2023")).click();

            // Select the number of passengers
            driver.findElement(By.id("myFunction4")).click();
            driver.findElement(By.xpath("//div[@id='field2']/button[2]")).click();
            driver.findElement(By.id("traveLer")).click();

            // Click on the search button
            driver.findElement(By.xpath("//div[@id='showOWRT']/div/div[7]/button")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            // Return true if the search flights functionality is available
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean bookFlight() {

        WebElement bookFlight = driver.findElement(By.xpath("(//button[text()='Book Now'])[1]"));
        return bookFlight.isDisplayed();
    }

    public boolean booking() {
        try {
            driver.findElement(By.xpath("(//button[text()='Book Now'])[1]")).click();

            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public boolean travelerInsuranceIsPresent() {

        WebElement travelerInsurance = driver.findElement(By.id("divInsuranceTab"));

        return travelerInsurance.isDisplayed();
    }

    public boolean travelerEmailIsPresent() {

        WebElement travelerEmail = driver.findElement(By.id("txtEmailId"));
        return travelerEmail.isDisplayed();
    }

    public boolean bookingButtonIsPresent() {

        WebElement bookingButton = driver.findElement(By.id("spnVerifyEmail"));
        return bookingButton.isDisplayed();
    }

    public boolean reviewFlight() {
        // Check travel insurance
        try {
            driver.findElement(By.id("notinsure")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            // Fill in the traveler details
            driver.findElement(By.id("txtEmailId")).sendKeys(getTest("email"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.findElement(By.id("spnVerifyEmail")).click();

            // Enter details for passenger
            WebElement dropDown = driver.findElement(By.xpath("//select[@id='titleAdult0']/option[2]"));
            dropDown.click();
            driver.findElement(By.id("txtFNAdult0")).sendKeys(getTest("adultname"));
            driver.findElement(By.id("txtLNAdult0")).sendKeys(getTest("adultsurname"));
            driver.findElement(By.xpath("//select[@id='titleChild0']/option[2]")).click();
            driver.findElement(By.id("txtFNChild0")).sendKeys(getTest("childname"));
            driver.findElement(By.id("txtLNChild0")).sendKeys(getTest("childsurname"));
            driver.findElement(By.id("txtCPhone")).sendKeys(getTest("mobile_number"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean passengerDetailsIsPresent() {

        WebElement passengerDetails = driver.findElement(By.id("divTravellerSHow"));
        return passengerDetails.isDisplayed();
    }

    public boolean continueBookingIsPresent() {

        WebElement continueBooking = driver.findElement(By.id("spnTransaction"));
        return continueBooking.isDisplayed();
    }

    public void continueBooking() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("spnTransaction")).click();
        try {
            driver.findElement(By.xpath("//div[@id='seatPo_0']/div[5]/a[2]")).click();
            Thread.sleep(4000);
            driver.findElement(By.id("skipPop")).click();
        } catch (Exception e) {
            driver.findElement(By.id("skipPop")).click();
        }

    }

    public boolean paymentMethodIsPresent() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement paymentMethods =  driver.findElement(By.id("divPaymentMode"));
        return paymentMethods.isDisplayed();
    }


}
