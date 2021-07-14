package com.bridgelab.junituservalidation;

import java.util.regex.Pattern;

/*************************************************************************************
 * @author mihir
 *
 * @since 12-July-2021
 * In this class we are validation user input.
 * Using regex rules that we have already defined.
 * User must input values according to regex rules or error message will get displayed.
 *************************************************************************************/

public class UserValidation
{
    UserDetails userDetailsObject;
    //constructor
    public UserValidation()
    {
        userDetailsObject = new UserDetails();
    }

    /**
     * Name : enterFirstName.
     *
     * Description : Asking user to enter first name.
     *
     * Algorithm : Checking if entered name follows defined pattern rules or not.
     * using regex.
     *
     * Modification : First commit 12-July-2021.
     */
    public boolean enterFirstName(String firstName)
    {
        //regex first character should be Capital letter and name should have minimum 3 characters.
        try
        {
            boolean isTrue = Pattern.compile("^[A-Z][A-z a-z]{2,}$").matcher(firstName).matches();
            if (isTrue == true) {
                userDetailsObject.setFirstName(firstName);
            } else {
                System.err.print("Wrong Input : Fist letter Should be capital and must contains minimum 3 characters :\n");
                System.out.println();
                enterFirstName(firstName);
            }
            return isTrue;
        }
        catch (NullPointerException exception)
        {
            throw new UserValidationException("First name cant not be NULL !");
        }
    }

    /**
     * Name : enterLastName.
     *
     * Description : Asking user to enter first name.
     *
     * Algorithm : Checking if entered last name follows defined pattern rules or not.
     * using regex.
     *
     * Modification : First commit 12-July-2021.
     */
    public boolean enterLastName(String lastName)
    {
        //regex first character should be Capital letter and name should have minimum 3 characters.
        try
        {
            boolean isTrue = Pattern.compile("^[A-Z][A-Z a-z]{2,}$").matcher(lastName).matches();
            if (isTrue == true) {
                userDetailsObject.setLastName(lastName);
            } else {
                System.err.print("Wrong Input : Fist letter Should be capital and must contains minimum 3 characters :\n");
                System.out.println();
                enterFirstName(lastName);
            }
            return isTrue;
        }
        catch (NullPointerException exception)
        {
            throw new UserValidationException("Last name cant not be NULL !");
        }
    }

    /**
     * Name : enterEmailId.
     *
     * Description : Asking user to enter Email-Id.
     *
     * Algorithm : Checking if entered email-id follows defined pattern rules or not.
     * using regex.
     * E.g. abc.xyz@bl.co.in
     * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
     *
     * Modification : First commit 12-July-2021.
     */
    public boolean enterEmailId(String emailId)
    {
        try
        {
            boolean isTrue = Pattern.compile("^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@([A-Za-z0-9]+).([A-Za-z]{2,4})(\\.[A-Za-z]{2,3})?$").matcher(emailId).matches();
            if(isTrue == true)
            {
                userDetailsObject.setEmailid(emailId);
            }
            else
            {
                System.err.print("\nWrong Input : E.g. abc.xyz@bl.co.in Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions ");
                System.out.println();
                return enterEmailId(emailId);
            }
            return isTrue;
        }
        catch (NullPointerException exception)
        {
            throw new UserValidationException("Email-Id cant not be NULL !");
        }
    }

    /**
     * Name : enterMobileNumber.
     *
     * Description : Asking user to enter mobile number.
     *
     * Algorithm : Checking if entered mobile number follows defined pattern rules or not.
     * using regex.
     * example - 91 9987000000
     * Rules : country code followed by space and 10 digit number.
     *
     * Modification : First commit 12-July-2021.
     */
    public boolean enterMobileNumber(String mobileNumber)
    {
        try
        {
            boolean isTrue = Pattern.compile("^[0-9]\\d{1,2}\\s[789]\\d{9}$").matcher(mobileNumber).matches();
            if(isTrue == true)
            {
                userDetailsObject.setMobileNumber(mobileNumber);
            }
            else
            {
                System.err.print("\nWrong Input : Country code followed by space and 10 digit number :");
                System.out.println();
                enterMobileNumber(mobileNumber);
            }
            return isTrue;
        }
        catch (NullPointerException exception)
        {
            throw new UserValidationException("Mobile Number cant not be NULL !");
        }
    }

    /**
     * Name : enterPassword.
     *
     * Description : Asking user to enter password.
     *
     * Algorithm : Checking if entered password follows defined pattern rules or not.
     * using regex.
     * must contain 8 characters.
     * should have at least one upper case.
     * should have at least one numeric value.
     * should have exactly one special character.
     *
     * Modification : First commit 12-July-2021.
     */
    public boolean enterPassword(String password)
    {
        try
        {
            boolean isTrue = Pattern.compile("^(?=.*[0-9])(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z]).{8,20}$").matcher(password).matches();
            if(isTrue == true)
            {
                userDetailsObject.setPassword(password);
            }
            else
            {
                System.err.print("\nWrong Input : Password must be of 8 characters :");
                System.out.println();
                enterPassword(password);
            }
            return isTrue;
        }
        catch (NullPointerException exception)
        {
            throw new UserValidationException("Password cant not be NULL !");
        }
    }

    /**
     * Name : printAllUserDetails.
     *
     * Description : Printing User Details..
     *
     * Modification : First commit 12-July-2021.
     */
    public void printAllUserDetails()
    {
        System.out.println("\n" + userDetailsObject);
    }
}
