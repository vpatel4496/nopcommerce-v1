package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Register;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    Register register = new Register();
    @Test
    public void  userShouldNavigateToRegisterPageSuccessfully() {
//* click on the ‘Register’ link
        register.clickOnRegister();
//* Verify the text ‘Register’
        String actualRegisterText = register.verifyRegisterText();
        String expectedRegisterText = "Register";
        Assert.assertEquals(actualRegisterText,expectedRegisterText);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully() {
//* click on the ‘Register’ link
        register.clickOnRegister();
//* Select gender radio button
        register.selectGender();
//* Enter First name
        register.enterFirstName("xyz");
//* Enter Last name
        register.enterLastName("patel");
//* Select Day Month and Year
        register.selectDayFromIndex(21);
        register.selectMonthFromDropDown("4");
        register.selectYearFromDropDown("1999");
//* Enter Email address
        register.enterEmail();
//* Enter Password
        register.enterPassword("abc123");
//* Enter Confirm password
        register.enterConfirmPassword("abc123");
//* Click on REGISTER button
        register.clickOnRegister1();
//* Verify the text 'Your registration completed’
        String actualRegistrationText =  register.verifyRegisterText1();
        String expectedRegistrationText = "Your registration completed";
        Assert.assertEquals(actualRegistrationText,expectedRegistrationText);
    }
}
