package com.company.Decorator;

public abstract class Beverage {
    String size = "";
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(String str){
        this.size = str;
    }

    public String getSize(){
        return this.size;
    }
}
