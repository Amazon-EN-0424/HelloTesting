package com.ironhack.parttwo;

public class NameEmptyException extends RuntimeException{

    public NameEmptyException() {
        super("There is a problem with the name");
    }

    public NameEmptyException(String message) {
        super(message);
    }
}
