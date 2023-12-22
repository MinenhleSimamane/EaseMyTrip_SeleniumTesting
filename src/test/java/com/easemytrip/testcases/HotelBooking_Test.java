package com.easemytrip.testcases;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class HotelBooking_Test extends Base{

    WebDriver driver = new ChromeDriver();

    @Test
    public void a_TestCitySelection() {
        driver.get(getTest("hotel_booking_Url")); // Replace with your website URL

        WebElement cityDropdown = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/form/div"));
        cityDropdown.click();
        Assert.assertTrue(cityDropdown.isDisplayed());

        WebElement specificCity = driver.findElement(By.xpath("//*[@id=\"divTopCity\"]/div/div[3]/a[4]"));
        specificCity.click();
        Assert.assertTrue(specificCity.isEnabled());
    }


    @Test
    public void b_TestCheckInOutDateSelection() throws InterruptedException {
        driver.get(getTest("hotel_booking_Url")); // Replace with your website URL

        // Selecting check-in date
        WebElement checkInDate = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div[1]"));
        checkInDate.click();
        WebElement specificCheckInDate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[3]/a"));
        specificCheckInDate.click();
        WebElement checkOutDate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[7]/a"));
        checkOutDate.click();

        Assert.assertTrue(checkOutDate.isDisplayed());

    }


    @Test
    public void c_RoomsAndGuests() throws InterruptedException {
        driver.get(getTest("hotel_booking_Url")); // Replace with your website URL

        WebElement divClick = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div[3]"));
        divClick.click();

        // Selecting rooms and guests
        WebElement roomsAndGuests = driver.findElement(By.id("exithotelroom"));
        roomsAndGuests.click();

        // Add assertions for rooms and guests selection
        Assert.assertTrue(roomsAndGuests.isDisplayed());
        // You can add more specific assertions here if needed

    }

    @Test
    public void d_SearchBtn() throws InterruptedException {
        driver.get(getTest("hotel_booking_Url")); // Replace with your website URL


        WebElement cityDropdown = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/form/div"));
        cityDropdown.click();


        WebElement specificCity = driver.findElement(By.xpath("//*[@id=\"divTopCity\"]/div/div[3]/a[4]"));
        specificCity.click();


        // Click search button
        WebElement searchButton = driver.findElement(By.id("btnSearch"));
        searchButton.click();

        // Add assertions for search button click
        Assert.assertTrue(driver.getCurrentUrl().contains("hotels-in-mumbai"));
        // You can add more specific assertions here if needed
    }


    @Test
    public void e_ViewRoom() throws InterruptedException {
        driver.get(getTest("viewRoomUrl"));
        Thread.sleep(6000);

        WebElement viewButton = driver.findElement(By.xpath("//*[@id=\"hotelListDiv\"]/div/div[5]/div[1]/div/div[2]/div[2]/a/div"));
        viewButton.click();

        Assert.assertTrue(viewButton.isDisplayed());
    }


    @Test
    public void f_BookNow() throws InterruptedException {

        driver.get(getTest("bookNowUrl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divDesc']/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]")));

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"divDesc\"]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", btn);

        Assert.assertTrue(btn.isDisplayed());
    }

    @Test
    public void g_GuestCredentialsFirstName() throws InterruptedException {

        driver.get("https://www.easemytrip.com/hotels/hotel-jyoti-dwelling-1044520/?e=20231219232412&city=Mumbai,%20India&cin=20/12/2023&cOut=21/12/2023&Hotel=NA&Rooms=1&pax=2&key=15~INR~MUMBAI~12-20-2023~12-21-2023~1~2_~~~B2CLOGIN~NA~NA~NA~IN&ecid=EMTHOTEL-1044520&hid=SHL-18052475017906");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divDesc']/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]")));

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"divDesc\"]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", btn);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement firstName = driver.findElement(By.id("txtFirstName1"));
        firstName.sendKeys(getTest("adultName"));
        Assert.assertTrue(firstName.isDisplayed());
    }

    @Test
    public void h_GuestCredentialsLastName() throws InterruptedException {
        driver.get(getTest("credentialsUrl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divDesc']/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]")));

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"divDesc\"]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", btn);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement lastName = driver.findElement(By.id("txtLastName1"));
        lastName.sendKeys(getTest("adultsurname"));
        Assert.assertTrue(lastName.isDisplayed());
    }
    @Test
    public void i_GuestCredentialsEmail() throws InterruptedException {
        driver.get(getTest("credentialsUrl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divDesc']/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]")));

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"divDesc\"]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", btn);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement email = driver.findElement(By.id("txtEmailId"));
        email.sendKeys(getTest("email"));
        Assert.assertTrue(email.isDisplayed());
    }
    @Test
    public void j_GuestCredentialsPhoneNum() throws InterruptedException {
        driver.get(getTest("credentialsUrl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divDesc']/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]")));

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"divDesc\"]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", btn);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement number = driver.findElement(By.id("txtCPhone"));
        number.sendKeys(getTest("mobile_number"));
        Assert.assertTrue(number.isDisplayed());
    }

    @Test
    public void k_GuestCredentialsCtnPaymentBtn() throws InterruptedException {
        driver.get(getTest("credentialsUrl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divDesc']/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]")));

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"divDesc\"]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/a[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", btn);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement firstName = driver.findElement(By.id("txtFirstName1"));
        firstName.sendKeys(getTest("adultName"));


        WebElement lastName = driver.findElement(By.id("txtLastName1"));
        lastName.sendKeys(getTest("adultsurname"));


        WebElement email = driver.findElement(By.id("txtEmailId"));
        email.sendKeys(getTest("email"));


        WebElement number = driver.findElement(By.id("txtCPhone"));
        number.sendKeys(getTest("mobile_number"));


        WebElement ctnBtn = driver.findElement(By.xpath("//*[@id=\"btnTravellerContinue\"]/div[1]"));
        ctnBtn.click();
        Assert.assertTrue(ctnBtn.isDisplayed());
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }
    }
}

