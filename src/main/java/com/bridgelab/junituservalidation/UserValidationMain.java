package com.bridgelab.junituservalidation;

import java.util.Scanner;

/******************************************************************
 * @author mihir
 *
 * @since 12-July-2021
 * This is main class for this project.
 * From this class we will be calling the methods from other classes.
 *******************************************************************/

public class UserValidationMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        UserValidation userValidationObj = new UserValidation();

        //Calling the methods:
        System.out.print("ENTER FIRST NAME : ");
        String firstName = scanner.next();
        userValidationObj.enterFirstName(firstName);//end for firstname.

        System.out.print("ENTER LAST NAME : ");
        String lastName = scanner.next();
        userValidationObj.enterFirstName(lastName);//end for lastName.

        System.out.print("ENTER EMAIL-ID : ");
        String emailId = scanner.next();
        userValidationObj.enterEmailId(emailId);//end for emailId.

        System.out.print("ENTER PHONE NUMBER : ");
        String mobileNumber = scanner.nextLine();
        userValidationObj.enterMobileNumber(mobileNumber);//end for mobileNumber.

        System.out.print("ENTER PASSWORD : ");
        String password = scanner.next();
        userValidationObj.enterPassword(password);//end for password.

        userValidationObj.printAllUserDetails();
        scanner.close();
    }
}
