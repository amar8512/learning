package com.company.exception;

public class OverflowException extends  Exception{
    String message;
    public OverflowException(String message){
        super(message);
    }
}
