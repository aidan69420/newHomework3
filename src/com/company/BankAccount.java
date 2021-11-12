package com.company;

public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount = amount + sum;
    }

    public void withDraw(double sum) throws LimitException {
        amount = amount - sum;
        if (amount < 0){
            amount = 0;
            throw new LimitException("Сумма снятия, больше, чем ваш остаток на счёте");
        }
    }

}
