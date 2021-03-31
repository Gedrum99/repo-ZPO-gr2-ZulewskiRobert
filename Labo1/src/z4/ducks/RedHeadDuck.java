package z4.ducks;

import z4.fly.*;
import z4.quack.*;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
