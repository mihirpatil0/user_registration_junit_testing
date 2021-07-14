package com.bridgelab.jubituservalidationtesting;

import com.bridgelab.junituservalidation.UserValidation;
import com.bridgelab.junituservalidation.UserValidationException;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

/*******************************************************************
 * @author mihir
 *
 * @since 12-July-2021
 * This is Junit Testing class.
 * Here creating different methods for all possible scenarios to test.
 *******************************************************************/

public class JunitTestingUserRegistrationValidation
{
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        UserValidation userValidationObj = new UserValidation();
        boolean isValid = userValidationObj.enterFirstName("Mihir");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenFirstName_whenNull_shouldReturnCustomizedException()
    {
        try
        {
            UserValidation userValidationObj = new UserValidation();
            exceptionRule.expect(UserValidationException.class);
            exceptionRule.expectMessage("First Name can not be NULL !");
            boolean isValid = userValidationObj.enterFirstName(null);
        }
        catch (UserValidationException userValidationException)
        {

        }
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
    public void givenLastName_whenNull_shouldReturnCustomizedException()
    {
        try
        {
            UserValidation userValidationObj = new UserValidation();
            exceptionRule.expect(UserValidationException.class);
            exceptionRule.expectMessage("Last Name can not be NULL !");
            boolean isValid = userValidationObj.enterLastName(null);
        }
        catch (UserValidationException userValidationException)
        {

        }
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
    public void givenEmailId_whenNull_shouldReturnCustomizedException()
    {
        try
        {
            UserValidation userValidationObj = new UserValidation();
            exceptionRule.expect(UserValidationException.class);
            exceptionRule.expectMessage("Email-Id can not be NULL !");
            boolean isValid = userValidationObj.enterEmailId(null);
        }
        catch (UserValidationException userValidationException)
        {

        }
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

    @Test
    public void givenMobileNumber_whenProper_shouldReturnTrue()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterMobileNumber("91 9899086705");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenMobileNumber_whenNull_shouldReturnCustomizedException()
    {
        try
        {
            UserValidation userValidationObj = new UserValidation();
            exceptionRule.expect(UserValidationException.class);
            exceptionRule.expectMessage("Mobile Number can not be NULL !");
            boolean isValid = userValidationObj.enterMobileNumber(null);
        }
        catch (UserValidationException userValidationException)
        {

        }
    }

    @Test
    public void givenMobileNumber_whenNumberIsLessThanFixedLength_shouldReturnFalse()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterMobileNumber("91 9899086");
        Assertions.assertFalse(isValid);
    }

    @Test
    public void givenMobileNumber_whenNumberIsGreaterThanFixedLength_shouldReturnFalse()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterMobileNumber("91 9899086000000000");
        Assertions.assertFalse(isValid);
    }

    @Test
    public void givenMobileNumber_whenCountryCodeMissing_shouldReturnFalse()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterMobileNumber("9800989340");
        Assertions.assertFalse(isValid);
    }//end for mobile number validation test case.

    @Test
    public void givenPassword_whenProper_shouldReturnTrue()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterPassword("Aydbeo09");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenPassword_whenNull_shouldReturnCustomizedException()
    {
        try
        {
            UserValidation userValidationObj = new UserValidation();
            exceptionRule.expect(UserValidationException.class);
            exceptionRule.expectMessage("Password can not be NULL !");
            boolean isValid = userValidationObj.enterPassword(null);
        }
        catch (UserValidationException userValidationException)
        {

        }
    }

    @Test
    public void givenPassword_shouldHaveOneUpperCase_whenMatched_shouldReturnTrue()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterPassword("AaaMihir");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenPassword_whenHadAtLeastOneNumericValue_shouldReturnTrue()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterPassword("AaaMihi8");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenPassword_whenNumericValueIsNotPresent_shouldReturnFalse()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterPassword("Aaa");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenPassword_whenHadExactlyOneSpecialCharacter_shouldReturnTrue()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterPassword("Mihir@08");
        Assertions.assertTrue(isValid);
    }

    @Test
    public void givenPassword_whenSpecialCharacterValueIsNotPresent_shouldReturnFalse()
    {
        UserValidation userValidation = new UserValidation();
        boolean isValid = userValidation.enterPassword("Mihirp08");
        Assertions.assertTrue(isValid);
    }//end for password validation test case.
}
