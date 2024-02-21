package com.mycompany.abstrakpropolish;

public abstract class sharpe {
 String color;
    
    void setColor(String color){
        this.color = color;
    }
    
    String getColor(){
        return this.color;
    }
    
    abstract float getArea();    
}

