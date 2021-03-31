package z4.ducks;

import z4.fly.FlyBehavior;
import z4.quack.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){};
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

    public void swim(){
        System.out.println("Wszystkie kaczki pływają, nawet wabiki!");
    }
}
