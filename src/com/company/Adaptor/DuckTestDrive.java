package com.company.Adaptor;

public class DuckTestDrive {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck(); // Duck 생성
        WildTurkey turkey = new WildTurkey(); // Turkey 생성
        Duck turkeyToDuck = new TurkeyAdapter(turkey); // Turkey에 어댑터 적용!!

        System.out.println("칠면조가 말하길...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길...");
        testDuck(duck);

        System.out.println("\n터키어댑터가 말하길...");
        testDuck(turkeyToDuck);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
