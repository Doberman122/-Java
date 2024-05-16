package org.example;
public class IllegalArgumentException extends Exception {
    public int depositin;

    public IllegalArgumentException(int depositin) {
        this.depositin = depositin;
    }

    @Override
    public String getMessage() {
        return String.format("Illegal argument: %s", depositin);
    }

}
