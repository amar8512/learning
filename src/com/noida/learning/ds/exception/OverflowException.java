package com.noida.learning.ds.exception;

public class OverflowException extends  Exception{
    String message;
    public OverflowException(String message){
        super(message);
    }
}
