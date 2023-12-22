package com.easemytrip.page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class RegisterPage extends Base {

    private WebDriver driver;

    public RegisterPage() {
        super();
    }

    public void setup() {
        driver = new ChromeDriver();
        driver.get(getTest("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public WebElement getMyAccountdropdown(){
        // testcase for the dropdown button on the dashboard
        return driver.findElement(By.id("spnMyAcc"));
    }

    public WebElement getLoginORSignupBtn(){
        // login or signup button on the dropdown
        return driver.findElement(By.id("shwlogn"));
    }

    public  WebElement getLoginORSignuptxt(){
        // text field when the user will be able to enter their email address
        return driver.findElement(By.id("txtEmail"));
    }

    public WebElement getbtnLogin(){
        // button for validating the email address so the user can move to the next prompt
        return driver.findElement(By.id("shwotp"));
    }

    public WebElement getOTPtxt(){
        // text area on which the user will be able to input their OTP number
        return  driver.findElement(By.id("txtEmail1"));
    }

    public WebElement getRegisterBtn(){
        // the button to validate the otp entered by the user
        return driver.findElement(By.id("OtpLgnBtn"));
    }

    public WebElement getResendOTPBtn(){
        return driver.findElement(By.id("otpRsnd"));
    }


    public void tearDown(){
        driver.close();
    }

}
