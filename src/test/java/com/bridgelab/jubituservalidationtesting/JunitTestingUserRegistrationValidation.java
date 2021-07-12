package com.bridgelab.jubituservalidationtesting;

import com.bridgelab.junituservalidation.UserValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*******************************************************************
 * @author mihir
 *
 * @since 12-July-2021
 * This is Junit Testing class.
 * Here creating different methods for all possible scenarios to test.
 *******************************************************************/

public class JunitTestingUserRegistrationValidation
{
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        UserValidation userValidationObj = new UserValidation();
        boolean isValid = userValidationObj.enterFirstName("Mihir");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenFirstName_whenShort_shouldReturnFalse()
    {
        UserValidation userValidationObj = new UserValidation();
        boolean isValid = userValidationObj.enterFirstName("M");
        Assertions.assertFalse(isValid);
    }

    @Test
    public void givenFirstName_WhenFistCharacterSmall_ShouldReturnFalse()
    {
        UserValidation userValidationObj = new UserValidation();
        boolean isValid = userValidationObj.enterFirstName("mihir");
        Assertions.assertFalse(isValid);
    }//end of first name validation test cases.
}
