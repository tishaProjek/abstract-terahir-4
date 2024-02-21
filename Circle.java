package com.mycompany.abstrakpropolish;

public class Circle extends sharpe{
     private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    
    
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }
    
}
