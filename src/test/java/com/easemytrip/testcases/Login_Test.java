package com.easemytrip.testcases;
import java.io.IOException;

import base.Base;
import com.easemytrip.page.LoginPage;
import com.easemytrip.page.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Test extends Base {

    LoginPage lp;

    @BeforeMethod
    public void browserSetup() throws IOException {
        lp = new LoginPage();
        lp.setup();
    }

    @Test
    public void validateMyAccountDropDown() throws InterruptedException {
        WebElement btndropdown=lp.getMyAccountdropdown();
        btndropdown.click();
        Assert.assertTrue(btndropdown.isDisplayed());
    }
    @Test
    public void validateLoginORSignupBtn(){
        WebElement btndropdown=lp.getMyAccountdropdown();
        btndropdown.click();
        Assert.assertTrue(btndropdown.isDisplayed());


        WebElement btnsignup=lp.getLoginORSignupBtn();
        btnsignup.click();
        Assert.assertTrue(btnsignup.isDisplayed());
    }
    @Test
    public void validateLoginORSignuptxt(){
        WebElement btndropdown=lp.getMyAccountdropdown();
        btndropdown.click();
        Assert.assertTrue(btndropdown.isDisplayed());


        WebElement btnsignup=lp.getLoginORSignupBtn();
        btnsignup.click();
        Assert.assertTrue(btnsignup.isDisplayed());


        WebElement btnsignuptext=lp.getLoginORSignuptxt();
        btnsignuptext.sendKeys(getTest("email"));
        Assert.assertTrue(btnsignuptext.isDisplayed());
    }
    @Test
    public void validatebtnLogin(){
        WebElement btndropdown=lp.getMyAccountdropdown();
        btndropdown.click();
        Assert.assertTrue(btndropdown.isDisplayed());


        WebElement btnsignup=lp.getLoginORSignupBtn();
        btnsignup.click();
        Assert.assertTrue(btnsignup.isDisplayed());


        WebElement btnsignuptext=lp.getLoginORSignuptxt();
        btnsignuptext.sendKeys(getTest("email"));
        Assert.assertTrue(btnsignuptext.isDisplayed());


        WebElement btnlogin=lp.getbtnLogin();
        btnlogin.click();
        Assert.assertTrue(btnlogin.isDisplayed());
    }
    @Test
    public void validateOTPtxt(){
        WebElement btndropdown=lp.getMyAccountdropdown();
        btndropdown.click();
        Assert.assertTrue(btndropdown.isDisplayed());


        WebElement btnsignup=lp.getLoginORSignupBtn();
        btnsignup.click();
        Assert.assertTrue(btnsignup.isDisplayed());


        WebElement btnsignuptext=lp.getLoginORSignuptxt();
        btnsignuptext.sendKeys(getTest("email"));
        Assert.assertTrue(btnsignuptext.isDisplayed());


        WebElement btnlogin=lp.getbtnLogin();
        btnlogin.click();
        Assert.assertTrue(btnlogin.isDisplayed());


        WebElement btnOTPtxt=lp. getOTPtxt();
        btnOTPtxt.sendKeys(getTest("Otp"));
        Assert.assertTrue(btnOTPtxt.isDisplayed());
    }
    @Test
    public void validateOTPLoginBtn(){
        WebElement btndropdown=lp.getMyAccountdropdown();
        btndropdown.click();
        Assert.assertTrue(btndropdown.isDisplayed());


        WebElement btnsignup=lp.getLoginORSignupBtn();
        btnsignup.click();
        Assert.assertTrue(btnsignup.isDisplayed());


        WebElement btnsignuptext=lp.getLoginORSignuptxt();
        btnsignuptext.sendKeys(getTest("email"));
        Assert.assertTrue(btnsignuptext.isDisplayed());


        WebElement btnlogin=lp.getbtnLogin();
        btnlogin.click();
        Assert.assertTrue(btnlogin.isDisplayed());


        WebElement btnOTPtxt=lp. getOTPtxt();
        btnOTPtxt.sendKeys(getTest("Otp"));
        Assert.assertTrue(btnOTPtxt.isDisplayed());


        WebElement btnOTPLogin=lp.getRegisterBtn();
        btnOTPLogin.click();
        Assert.assertTrue(btnOTPLogin.isDisplayed());
    }
}