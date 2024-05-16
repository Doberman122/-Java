package org.example;

public class InsufficientFundsException extends Exception{
    public int withdrawin;

    public InsufficientFundsException(int withdrawin) {
        this.withdrawin = withdrawin;
    }
    @Override
    public String getMessage() {
        return String.format("Insufficient argument, %s", withdrawin);
    }
}
