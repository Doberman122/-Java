package org.example;

public class BankService extends Account{

    public BankService(int balance, String firstName, String lastName) throws IllegalArgumentException, InsufficientFundsException {
        super(balance, firstName, lastName);
//        if (balance < 0) {
//            throw new IllegalArgumentException(balance);
//        } else if (getBalance() - balance != getBalance()) {
//            throw new InsufficientFundsException(balance);
//        }
    }

    /**
     * Метод ввода начального баланса
     * @param amount
     * @return
     */
    public int deposit(int amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException(amount);
        }
       return getBalance() + amount;
    }

    /**
     * Метод снятия средств.
     * @param amount
     * @return
     */
    public int withdraw(int amount) throws InsufficientFundsException {
        if (getBalance() - amount != getBalance()){
            throw new InsufficientFundsException(amount);
        }
        return getBalance() - amount;
    }

}
