package z3;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Pole");
        frame.setLayout( null);
        frame.setPreferredSize( new Dimension(600,400) );
        frame.setMinimumSize( new Dimension(600,400) );
        frame.setMaximumSize( new Dimension(600,400) );

        FakeEditor fake=new FakeEditor();

        Kolor kolor=new Kolor( fake );
        Szerokość szerokość= new Szerokość( fake );
        Wysokość wysokość=new Wysokość( fake );
        Cofnij cofnij=new Cofnij( fake,kolor,wysokość,szerokość );

        frame.add(fake);
        frame.add( kolor );
        frame.add( szerokość );
        frame.add( wysokość );
        frame.add( cofnij );

        frame.setResizable( false );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}
