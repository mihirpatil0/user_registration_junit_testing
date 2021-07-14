package com.bridgelab.junituservalidation;

/*******************************************
 * @author mihir
 *
 * @since 14-July-2021
 * This class represent customized exception.
 *******************************************/

public class UserValidationException extends RuntimeException
{
    public UserValidationException(String message)
    {
        super(message);
    }
}
