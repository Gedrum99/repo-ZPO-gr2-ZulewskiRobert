package z1.ducks;

import z1.fly.*;
import z1.quack.*;

public class DecoyDuck extends Duck {
    public DecoyDuck(String name) {
        super(name);
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
