package com.company.Decorator;

// 추가 토핑을 의미하는 데코레이터 추상 클래스
public abstract class CondimentDecorator extends Beverage{ // Beverage가 들어갈 자리에 들어가기 위해 확장
    public abstract String getDescription(); // 모든 데코레이터에서 새로 구현하도록 하기 위함
}
