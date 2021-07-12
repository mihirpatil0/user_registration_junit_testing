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
    private String lastName;
    private String emailid;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    
    @Override
    public String toString() {
        return "UserDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailid='" + emailid + '\'' +
                '}';
    }
}
