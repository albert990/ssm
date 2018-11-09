package com.melvin.ssm.exception;

public class BizException extends RuntimeException {


    private static final long serialVersionID = 1L;

    public BizException(String message){
        super(message);
    }

    public BizException(String message,Throwable cause){
        super(message, cause);
    }
}
