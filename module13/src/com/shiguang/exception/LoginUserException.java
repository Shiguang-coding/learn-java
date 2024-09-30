package com.shiguang.exception;

public class LoginUserException extends Exception{
    public LoginUserException() {
    }

    public LoginUserException(String message) {
        super(message);
    }
}
