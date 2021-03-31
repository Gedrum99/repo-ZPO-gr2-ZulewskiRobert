package z4;

import z4.ducks.*;
import z4.fly.FlyRocketPowered;

import java.util.ArrayList;

public class MiniDuckSimulator {
    public static void main (String[] args) {
        DecoyDuck decoyDuck = new DecoyDuck();
        MallardDuck mallardDuck = new MallardDuck();
        ModelDuck modelDuck = new ModelDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add( decoyDuck );
        ducks.add( mallardDuck );
        ducks.add( modelDuck );
        ducks.add( redHeadDuck );
        ducks.add( rubberDuck );

        for( Duck kaczka:ducks)
        {
            kaczka.display();
            kaczka.performFly();
            kaczka.performQuack();
            System.out.println();
        }

        System.out.println("================================================");
        System.out.println("Uzbrojenie gumowej kaczuszki w rakietę!!!!!!!!");
        System.out.println("================================================");
        rubberDuck.setFlyBehavior( new FlyRocketPowered() );
        System.out.println("================================================");
        System.out.println("Ponowna próba prezentacji kaczek");
        System.out.println("================================================");
        for( Duck kaczka:ducks)
        {
            kaczka.display();
            kaczka.performFly();
            kaczka.performQuack();
            System.out.println();
        }
    }
}
