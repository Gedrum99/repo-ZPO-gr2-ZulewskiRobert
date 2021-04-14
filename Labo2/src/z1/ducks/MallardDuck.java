package z1.ducks;

import z1.fly.*;
import z1.quack.*;

public class MallardDuck extends Duck{
    public MallardDuck(String name) {
        super(name);
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
