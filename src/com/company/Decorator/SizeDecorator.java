package com.company.Decorator;

public abstract class SizeDecorator extends Beverage{ // 가격에 따른 분류
    public abstract String getDescription(); // 모든 데코레이터에서 새로 구현하도록 하기 위함
}
