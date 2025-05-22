package com.pluralsight.collection;

import java.util.ArrayList;

public class FixedList<T>{
    private ArrayList<T>items;
    private int maxSize;


    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items=new ArrayList<>();


    }
    public void add(T item){
        if (items.size()>=maxSize){
             System.err.println("item cannot be added. The list is full");
        }
        else {

            items.add(item);
        }
    }
    public ArrayList<T> getItems(){
        return items;
    }
}
