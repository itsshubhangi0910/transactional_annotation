package com.example.transactional_flight_service.exception;

public class InsufficientAmountException extends RuntimeException {

    public InsufficientAmountException(String msg){

        super(msg);
    }
}

