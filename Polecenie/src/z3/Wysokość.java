package z3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wysokość extends JButton implements Operacja{
    FakeEditor frame;
    List<Integer>wysokość=new ArrayList<>();
    List<Integer>szerokość=new ArrayList<>();

    public Wysokość(FakeEditor frame){
        super("Wysokość");
        this.frame=frame;
        wysokość.add(frame.getHeight());
        szerokość.add(frame.getWidth());
        setBounds( 250, 300, 150,50 );
        addActionListener( new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                execute();
            }
        } );
    }

    @Override
    public void execute () {
        Random rand = new Random();
        int x= frame.getWidth();
        int y= rand.nextInt(100)+51;
        wysokość.add(y);
        szerokość.add(x);
        int X=frame.getX();
        int Y=frame.getY();

        frame.setBounds( X,Y,x,y );
        frame.operacje.add( "Wysokość" );
        frame.wys();
    }

    @Override
    public void undo () {
        int j=szerokość.size()-1;
        frame.setBounds( frame.getX(),frame.getY(),szerokość.get( j-1 ),wysokość.get( j-1 ) );
        wysokość.remove( j );
        szerokość.remove( j );
    }

}
