package z3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kolor extends JButton implements Operacja{
    FakeEditor frame;
    List<Integer>R=new ArrayList<>();
    List<Integer>G=new ArrayList<>();
    List<Integer>B=new ArrayList<>();

    public Kolor(FakeEditor frame){
        super("Kolor");
        this.frame=frame;
        this.R.add(244);
        this.G.add(11);
        this.B.add(111);
        setBounds( 150, 300, 75,50 );
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
        int r,g,b;
        r= rand.nextInt(255);
        this.R.add(r);
        g= rand.nextInt(255);
        this.G.add(g);
        b= rand.nextInt(255);
        this.B.add(b);
        frame.setBackground( new Color( r,g,b ) );
        frame.operacje.add( "Kolor" );
        frame.wys();
    }

    @Override
    public void undo () {

        int j=R.size()-1;
        frame.setBackground( new Color( R.get( j-1 ),G.get( j-1 ),B.get( j-1 ) ) );
        R.remove( j );
        G.remove( j );
        B.remove( j );
    }

}
