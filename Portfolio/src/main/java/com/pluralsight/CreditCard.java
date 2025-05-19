package com.pluralsight;

public class CreditCard extends BankAccount implements Valuable{
    public CreditCard(String name, String accountNumber, double balance){
        super(name,accountNumber,balance);

    }


    public void charge(double amount){
        balance+=amount;


    }
    public void pay(double amount){
        balance-=amount;

    }
    @Override
    public double getValue() {
        return -balance;
    }
}
