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
        boolean isTrue = Pattern.compile("^[A-Z][A-z a-z]{2,}$").matcher(firstName).matches();
        if(isTrue == true)
        {
            userDetailsObject.setFirstName(firstName);
        }
        else
        {
            System.err.print("Wrong Input : Fist letter Should be capital and must contains minimum 3 characters :\n");
            System.out.println();
            enterFirstName(firstName);
        }
        return isTrue;
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
        boolean isTrue = Pattern.compile("^[A-Z][A-Z a-z]{2,}$").matcher(lastName).matches();
        if(isTrue == true)
        {
            userDetailsObject.setLastName(lastName);
        }
        else
        {
            System.err.print("Wrong Input : Fist letter Should be capital and must contains minimum 3 characters :\n");
            System.out.println();
            enterFirstName(lastName);
        }
        return isTrue;
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
