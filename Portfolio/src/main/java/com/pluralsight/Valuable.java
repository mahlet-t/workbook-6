package com.pluralsight;

public interface Valuable extends Comparable<Valuable> {
    public double getValue();
    default int compareTo(Valuable other){
     return    Double.compare(this.getValue(),other.getValue());
    }
}
