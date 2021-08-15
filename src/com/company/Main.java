package com.company;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import sun.nio.ch.sctp.SctpNet;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}

abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다.");
    }
    public abstract void display();
}

interface FlyBehavior{
    public void fly();
}

interface QuackBehavior{
    public void quack();
}

class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("Fly!!");
    }
}

class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("날수 없음!");
    }
}

class FlyRocketPowered implements FlyBehavior{
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다.");
    }
}

class Quack implements QuackBehavior{
    public void quack(){
        System.out.println("꽥꽥!");
    }
}

class Squeak implements QuackBehavior{
    public void quack(){
        System.out.println("Squeak!");
    }
}

class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("조용~~");
    }
}

class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("물오리 입니다!");
    }
}

class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("모형오리 입니다!");
    }
}