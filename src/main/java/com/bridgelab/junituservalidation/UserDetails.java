package com.bridgelab.junituservalidation;

/******************************************************************
 * @author mihir
 *
 * @since 12-July-2021
 *
 * This class holds variables that defines user details.
 * Like First name, Last name, Email-Id, Mobile number and password.
 * Also has getter setter and toString methods.
 *******************************************************************/

public class UserDetails
{
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User-Details : [" +
                "First-Name='" + firstName + '\'' +
                ']';
    }
}
