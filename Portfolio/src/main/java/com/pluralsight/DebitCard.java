package com.pluralsight;

public class DebitCard extends BankAccount implements Valuable{
    public DebitCard(String name, String accountNumber, double balance){
        super(name,accountNumber,balance);
    }


    public void deposit(double amount){
        balance+=amount;

    }
    public void withdraw(double amount) {
        balance -= amount;
    }

@Override
public double getValue() {
    return balance;
    }
}
