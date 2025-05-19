package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args) {
        DebitCard account1 = new DebitCard("pam","123", 12500);
        CreditCard account2=new CreditCard("sean","1212",120);
        account1.deposit(100);
        account1.withdraw(100);
        account2.charge(100);
        account2.pay(100);

        System.out.println("total balance :"+account1.getValue());
        System.out.println("total Balance :"+account2.getValue());
    }

}
