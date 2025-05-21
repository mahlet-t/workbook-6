package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Portfolio  {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;




    public Portfolio(String name, String owner, ArrayList<Valuable> valuables) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

public void addAsset(Valuable asset){

        assets.add(asset);
}
public double getValue(){
        double total=0;
        for (Valuable asset:assets){
            total+=asset.getValue();
        }

        return total;
}

public Object getMostValuable(){


return Collections.max(assets);
}
public Valuable GetLeastValuable(){
return Collections.min(assets);
}
}

