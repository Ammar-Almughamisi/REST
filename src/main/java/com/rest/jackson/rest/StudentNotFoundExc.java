package com.rest.jackson.rest;

public class StudentNotFoundExc extends RuntimeException {
    public StudentNotFoundExc() {
    }

    public StudentNotFoundExc(String message) {
        super(message);
    }

    public StudentNotFoundExc(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundExc(Throwable cause) {
        super(cause);
    }
}
