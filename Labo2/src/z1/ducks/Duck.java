package z1.ducks;

import z1.fly.FlyBehavior;
import z1.quack.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    String name;

    public Duck(String name){this.name=name;};
    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior)
    {
        this.flyBehavior=flyBehavior;
        this.quackBehavior=quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior)
    {
        this.flyBehavior=flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior)
    {
        this.quackBehavior=quackBehavior;
    }
    public void display(){
        System.out.println("Kaczka");
    };

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public String getName(){
        return this.name;
    }

    public void swim(){
        System.out.println("Wszystkie kaczki pływają, nawet wabiki!");
    }
}
