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
        boolean result = userRegistration.firstName("Prash");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("prash");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Navin");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("navin");
        Assert.assertEquals(false, result);


    }
}
