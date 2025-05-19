package com.pluralsight;

public class House extends FixedAsset{
 private int yearBuilt;
 private int squareFeet;
 private int bedrooms;
 private House(String name,double marketValue,int yearBuilt,int squareFeet,int bedrooms){

     super(name,marketValue);
 }

    @Override
    public double getValue() {
        return marketValue*squareFeet;
    }
}
