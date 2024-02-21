package com.mycompany.abstrakpropolish;

public class triangle extends sharpe  {
    private float base;
    private float height;

    public triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    
    float getArea() {
        return 0.5f * base * height;
    }
}
