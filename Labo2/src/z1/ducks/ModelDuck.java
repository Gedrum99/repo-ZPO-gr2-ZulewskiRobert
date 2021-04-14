package z1.ducks;

import z1.fly.*;
import z1.quack.*;

public class ModelDuck extends Duck{
    public ModelDuck(String name) {
        super(name);
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
