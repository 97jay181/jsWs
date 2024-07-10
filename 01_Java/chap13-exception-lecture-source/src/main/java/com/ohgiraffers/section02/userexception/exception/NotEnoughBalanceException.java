package com.ohgiraffers.section02.userexception.exception;

public class NotEnoughBalanceException extends Throwable {
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
