package org.example;
public class Account{
    private int balance = 10;
    private String firstName;
    private String lastName;

    public Account(int balance, String firstName, String lastName) {
        super();
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getBalance() {return balance;}

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}


}
