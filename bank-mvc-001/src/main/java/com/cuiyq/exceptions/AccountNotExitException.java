package com.cuiyq.exceptions;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：
 */
public class AccountNotExitException extends Exception{
    public AccountNotExitException() {
    }
    public AccountNotExitException(String message) {
        super(message);
    }
}
