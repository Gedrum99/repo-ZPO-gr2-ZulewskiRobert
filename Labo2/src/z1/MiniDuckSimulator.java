package z1;

import z1.ducks.*;
import z1.fly.FlyRocketPowered;
import z1.sort.BubbleSort;
import z1.sort.InsertSort;
import z1.sort.MergeSort;
import z1.sort.SortListOrArray;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MiniDuckSimulator {
    public static void main (String[] args) {
        List<Duck> ducks = new ArrayList<>();

        ducks.add(new DecoyDuck("Decoy"));
        ducks.add(new MallardDuck("Mallard"));
        ducks.add(new ModelDuck("Model"));
        ducks.add(new RedHeadDuck("RedHead"));
        ducks.add(new RubberDuck("Rubber"));
        ducks.add(new DecoyDuck("Stefan"));
        ducks.add(new MallardDuck("Einstein"));
        ducks.add(new ModelDuck("Fake"));
        ducks.add(new RedHeadDuck("Ginger"));
        ducks.add(new RubberDuck("Ducky"));
        ducks.add(new DecoyDuck("Poke"));
        ducks.add(new MallardDuck("Pepe"));
        ducks.add(new ModelDuck("Kwalicyn"));
        ducks.add(new RedHeadDuck("Ferdynand"));
        ducks.add(new RubberDuck("Zenek"));
/*
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
        }*/

        Duck[] kaczki=new Duck[ducks.size()];
        for( int i=0; i<kaczki.length;i++){
            kaczki[i] = ducks.get(i);
        }

        SortListOrArray[] strategies = { new BubbleSort(), new MergeSort(), new InsertSort()};
        Random r = new Random();

        int number = r.nextInt(3);

        SortListOrArray strategy = strategies[number];

        // sortowanie listy
        {
            System.out.println( "Lista" );
            LocalTime start = LocalTime.now();
            strategy.sort( ducks );
            LocalTime end = LocalTime.now();

            Duration diff = Duration.between( start, end );
            System.out.println( strategy.getSortName() + "  time:" + diff.toMillis() + " ms " );
        }
        System.out.println("----------------------------------");
        //z jakiegoś powodu drugie sortowanie nie chce działać poprawnie, mimo że powinno (nie wiem czy nie jest to związane z wersją Javy której używam(1.8))
        // sortowanie tablicy
        {
            System.out.println( "Tablica" );
            LocalTime start = LocalTime.now();
            strategy.sort( kaczki );
            LocalTime end = LocalTime.now();
            Duration diff = Duration.between( start, end );
            System.out.println( strategy.getSortName() + "  time:" + diff.toMillis() + " ms " );
        }
    }
}
