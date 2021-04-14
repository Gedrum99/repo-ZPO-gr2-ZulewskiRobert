package z1.ducks;

import z1.fly.*;
import z1.quack.*;

public class RubberDuck extends Duck{
    public RubberDuck(String name) {
        super(name);
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
