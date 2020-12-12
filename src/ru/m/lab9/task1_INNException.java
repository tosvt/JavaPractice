package ru.m.lab9;

public class task1_INNException extends Throwable {
    private String message;
    public task1_INNException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}