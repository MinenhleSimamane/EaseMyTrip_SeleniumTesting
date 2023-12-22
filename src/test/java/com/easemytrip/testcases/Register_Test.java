package com.easemytrip.testcases;
import base.Base;
import com.easemytrip.page.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

public class Register_Test extends Base {
    private RegisterPage rg;

    public Register_Test() {
        super();
    }

    @BeforeMethod
    public void browserSetup() throws IOException {
        rg = new RegisterPage();
        rg.setup();
    }


    @Test
    public void validateMyAccount(){ // this is the testcase that will check if the dropdown is working
        WebElement btndropdown = rg.getMyAccountdropdown();
        btndropdown.click();
        // Check if the button is displayed
        Assert.assertTrue(btndropdown.isDisplayed());
    }

    @Test
    public void validateLoginSignupBtn(){ // this testcase is to check if the button on the dropdown is working

        // Code for Testcase1
        WebElement btndropdown = rg.getMyAccountdropdown();
        btndropdown.click();


        // code for Testcase2
        WebElement loginSignupBtn = rg.getLoginORSignupBtn();
        // Click the button to simulate user interaction
        loginSignupBtn.click();
        // Check if the button is displayed
        Assert.assertTrue(loginSignupBtn.isDisplayed());


    }

    @Test
    public void validateEmailAddtxt(){// this testcase is to check if the text field for email address is working
         // Code for Testcase1
        WebElement btndropdown = rg.getMyAccountdropdown();
        btndropdown.click();


        // code for Testcase2
        WebElement loginSignupBtn = rg.getLoginORSignupBtn();
        // Click the button to simulate user interaction
        loginSignupBtn.click();
        // Check if the button is displayed


        // code for Testcase3
        WebElement txtLoginORSignup = rg.getLoginORSignuptxt();
        txtLoginORSignup.sendKeys(getTest("email"));
        Assert.assertTrue(txtLoginORSignup.isDisplayed());


    }

    @Test
    public void validateEmailAddBtn(){ // this testcase is to check if the botton for validating the email address of the user is working
        // Code for Testcase1
        WebElement btndropdown = rg.getMyAccountdropdown();
        btndropdown.click();


        // code for Testcase2
        WebElement loginSignupBtn = rg.getLoginORSignupBtn();
        // Click the button to simulate user interaction
        loginSignupBtn.click();
        // Check if the button is displayed


        // code for Testcase3
        WebElement txtLoginORSignup = rg.getLoginORSignuptxt();
        txtLoginORSignup.sendKeys(getTest("email"));


        // Code for Testcase4
        WebElement btnLogin = rg.getbtnLogin();
        btnLogin.click();
        Assert.assertTrue(btnLogin.isDisplayed());
    }

    @Test
    public void validateOTPtxt(){ // this testcase is for checking if the text field for the OTP is working
        // Code for Testcase1
        WebElement btndropdown = rg.getMyAccountdropdown();
        btndropdown.click();


        // code for Testcase2
        WebElement loginSignupBtn = rg.getLoginORSignupBtn();
        // Click the button to simulate user interaction
        loginSignupBtn.click();
        // Check if the button is displayed


        // code for Testcase3
        WebElement txtLoginORSignup = rg.getLoginORSignuptxt();
        txtLoginORSignup.sendKeys(getTest("email"));


        // Code for Testcase4
        WebElement btnLogin = rg.getbtnLogin();
        btnLogin.click();


        //Code for Testcase5
        WebElement txtOTP = rg.getOTPtxt();
        txtOTP.sendKeys(getTest("Otp"));
        Assert.assertTrue(txtOTP.isDisplayed());
    }

    @Test
    public void validateOTPBtn(){ // this testcase is for checking if the button for validating the otp entered by the user is working
        // Code for Testcase1
        WebElement btndropdown = rg.getMyAccountdropdown();
        // Click the button to simulate user interaction
        btndropdown.click();


        // code for Testcase2
        WebElement loginSignupBtn = rg.getLoginORSignupBtn();
        // Click the button to simulate user interaction
        loginSignupBtn.click();


        // code for Testcase3
        WebElement txtLoginORSignup = rg.getLoginORSignuptxt();
        txtLoginORSignup.sendKeys(getTest("email"));


        // Code for Testcase4
        WebElement btnLogin = rg.getbtnLogin();
        btnLogin.click();


        //Code for Testcase5
        WebElement txtOTP = rg.getOTPtxt();
        txtOTP.sendKeys(getTest("Otp"));


        // Code for Testcase6
        WebElement btnRegister = rg.getRegisterBtn();
        btnRegister.click();
        // Check if the button is displayed
        Assert.assertTrue(btnRegister.isDisplayed());
    }

    @Test
    public void validateResendOtpBtn(){ // this testcase is for checking if the button for validating the otp entered by the user is working
        // Code for Testcase1
        WebElement btndropdown = rg.getMyAccountdropdown();
        // Click the button to simulate user interaction
        btndropdown.click();


        // code for Testcase2
        WebElement loginSignupBtn = rg.getLoginORSignupBtn();
        // Click the button to simulate user interaction
        loginSignupBtn.click();


        // code for Testcase3
        WebElement txtLoginORSignup = rg.getLoginORSignuptxt();
        txtLoginORSignup.sendKeys(getTest("email"));


        // Code for Testcase4
        WebElement btnLogin = rg.getbtnLogin();
        btnLogin.click();


        //Code for Testcase5
        WebElement txtOTP = rg.getOTPtxt();
        txtOTP.sendKeys(getTest("email"));


        // Code for Testcase6
        WebElement btnRegister = rg.getRegisterBtn();
        btnRegister.click();
        // Check if the button is displayed

        WebElement btnResendOtp = rg.getResendOTPBtn();
        btnResendOtp.click();
        Assert.assertTrue(btnResendOtp.isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
