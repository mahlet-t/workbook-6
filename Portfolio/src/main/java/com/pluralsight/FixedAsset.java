package com.pluralsight;

import java.util.ArrayList;

public abstract class  FixedAsset {
    protected String name;
   protected double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }
    public abstract double getValue();
}
