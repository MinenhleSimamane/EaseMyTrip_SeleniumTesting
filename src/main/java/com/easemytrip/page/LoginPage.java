package com.easemytrip.page;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPage {
    WebDriver driver;

    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.easemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    public WebElement getMyAccountdropdown(){
        return driver.findElement(By.id("spnMyAcc"));
    }

    public WebElement getLoginORSignupBtn(){
        return driver.findElement(By.id("shwlogn"));
    }

    public  WebElement getLoginORSignuptxt(){
        return driver.findElement(By.id("txtEmail"));
    }

    public WebElement getbtnLogin(){
        return driver.findElement(By.id("shwotp"));
    }

    public WebElement getOTPtxt(){
        return  driver.findElement(By.id("txtEmail1"));
    }

    public WebElement getRegisterBtn(){
        return driver.findElement(By.id("OtpLgnBtn"));
    }


    public void tearDown(){
        driver.close();
    }


}