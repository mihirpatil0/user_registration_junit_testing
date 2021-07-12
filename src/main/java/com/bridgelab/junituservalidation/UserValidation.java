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
