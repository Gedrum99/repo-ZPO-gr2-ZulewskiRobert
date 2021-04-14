package z1.ducks;

import z1.fly.*;
import z1.quack.*;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(String name) {
        super(name);
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
