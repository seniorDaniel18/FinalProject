package com.compamy;

public class MyException extends RuntimeException{

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
