package com.bridgelab.junituservalidation;

/**********************************************************
 * @author mihir
 *
 * This is functional interface for user validation project.
 * which has one non static method and one static method.
 **********************************************************/

@FunctionalInterface
public interface IUserValidator
{
    public boolean validate(String pattern,String value);
    static public void printBoolean(String pattern,String value,String function,IUserValidator validator)
    {
        System.out.println("Result of " + function + " function is " + validator.validate(pattern,value));
    }
}
