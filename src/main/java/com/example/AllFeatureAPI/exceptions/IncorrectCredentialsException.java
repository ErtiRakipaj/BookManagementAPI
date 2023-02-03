package com.example.AllFeatureAPI.exceptions;

public class IncorrectCredentialsException extends RuntimeException{
    public IncorrectCredentialsException(String msg){
        super(msg);
    }
}
