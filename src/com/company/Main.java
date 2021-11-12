package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount account = new BankAccount(20000);
        while (true){
            account.withDraw(6000);
            if (account.getAmount() <= 6000){
                account.withDraw(account.getAmount());
                System.out.println(account.getAmount());
                break;
            }
            System.out.println(account.getAmount());
        }
    }
}