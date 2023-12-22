package com.easemytrip.page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class HotelBookingPage extends Base {
    private WebDriver driver;

    public void setup() {
        driver = new ChromeDriver();
        driver.get(getTest("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

//    public WebElement getHotelTab(){
//        // testcase for the dropdown button on the dashboard
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getCity(){
//        // testcase for the dropdown button on the dashboard
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getCityTxt(){
//        // testcase for the dropdown button on the dashboard
//        return driver.findElement(By.id(""));
//    }
//    public WebElement getDate_in(){
//        // testcase for the dropdown button on the dashboard
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getDate_inSelector(){
//        // testcase for the dropdown button on the dashboard
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getDate_out(){
//        // testcase for the dropdown button on the dashboard
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getDate_outSelector(){
//        // testcase for the dropdown button on the dashboard
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getGuest(){
//        // testcase for the dropdown button on the dashboard
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getGuestDoneBtn(){
//        // testcase for the dropdown button on the dashboard
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getSearchBtn(){
//        // testcase for the dropdown button on the dashboard
//        return driver.findElement(By.id(""));
//    }
//    public WebElement getViewRoomBtn(){
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getBookNowBtn(){
//        return driver.findElement(By.id(""));
//    }
//
//
//    public WebElement getFirstNametxt(){
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getLastNametxt(){
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getemailID(){
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getPhoneNum(){
//        return driver.findElement(By.id(""));
//    }
//
//    public WebElement getctnPaymentBtn(){
//        return driver.findElement(By.id(""));
//    }

}
