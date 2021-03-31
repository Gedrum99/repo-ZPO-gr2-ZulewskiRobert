package z4.ducks;

import z4.fly.*;
import z4.quack.*;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
