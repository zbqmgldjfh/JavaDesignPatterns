package com.company.TemplateMethod;

public class Tea extends CaffeineBeverage{
    public void brew() {
        System.out.println("차를 우리는 중");
    }
    public void addCondiments() {System.out.println("레몬 추가하는 중");}
}
