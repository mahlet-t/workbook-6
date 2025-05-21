package com.pluralsight;

import java.util.ArrayList;

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
        Portfolio portfolio=new Portfolio("portfolio","mo",new ArrayList<>());
        Jewelry necklace=new Jewelry("beti",5000,32);
        Gold gold=new Gold("mahlet",2300,8);
        DebitCard debitCard=new DebitCard("mo","1234",65000);
        CreditCard card=new CreditCard("sean","4321",200);
        portfolio.addAsset(necklace);
        portfolio.addAsset(gold);
        portfolio.addAsset(debitCard);
        portfolio.addAsset(card);
        System.out.println(portfolio.getValue());
    }

}
