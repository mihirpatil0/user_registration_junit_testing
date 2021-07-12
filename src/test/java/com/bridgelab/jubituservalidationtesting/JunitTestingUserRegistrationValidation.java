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

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        UserValidation userValidationObj = new UserValidation();
        boolean isValid = userValidationObj.enterFirstName("Patil");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenLastName_whenShort_shouldReturnFalse()
    {
        UserValidation userValidationObj = new UserValidation();
        boolean isValid = userValidationObj.enterFirstName("Pt");
        Assertions.assertFalse(isValid);
    }

    @Test
    public void givenLastName_WhenFistCharacterSmall_ShouldReturnFalse()
    {
        UserValidation userValidationObj = new UserValidation();
        boolean isValid = userValidationObj.enterFirstName("patil");
        Assertions.assertFalse(isValid);
    }//end of last name validation test cases.

    @Test
    public void givenEmailId_whenProper_shouldReturnTrue()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterEmailId("mihir.patil@gmail.co.in");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenEmailId_whenOptionalPartMissing_shouldReturnTrue()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterEmailId("mihir@gmail.com");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenEmailId_whenGivenFirstSpecialCharacter_shouldReturnFalse()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterEmailId("+ihir.patil@gmail.co.in");
        Assertions.assertFalse(isValid);
    }

    @Test
    public void givenEmailId_whenGivenDotAfterWord_shouldReturnFalse()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterEmailId("mihir.@gmail.co.in");
        Assertions.assertFalse(isValid);
    }

    @Test
    public void givenEmailId_whenGivenTdlLengthGraterThanFour_shouldReturnFalse()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterEmailId("mihir.@gmail.commmm");
        Assertions.assertFalse(isValid);
    }//end of email validation.
}
