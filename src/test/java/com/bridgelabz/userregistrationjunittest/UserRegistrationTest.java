package com.bridgelabz.userregistrationjunittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration;

    @Before
    public void before() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Sushant");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("sushant");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Lad");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("lad");
        Assert.assertEquals(false, result);

    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.email("abc@gmail.com.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.email("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.phoneNumber("91 8830602356");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.phoneNumber("+91 8830602356");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule1("password@123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule1("psw@");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule2("passWord@123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule2("psw@");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule3("123Aa@123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule3("123456789");
        Assert.assertEquals(false, result);
    }
}
