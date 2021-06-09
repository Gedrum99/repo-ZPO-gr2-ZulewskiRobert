package z3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Cofnij extends JButton implements Operacja{
    FakeEditor frame;
    Kolor kolor;
    Wysokość wysokość;
    Szerokość szerokość;


    public Cofnij(FakeEditor frame, Kolor kolor, Wysokość wysokość, Szerokość szerokość){
        super("Cofnij");
        this.frame=frame;
        this.kolor=kolor;
        this.wysokość=wysokość;
        this.szerokość=szerokość;
        setBounds( 50, 300, 75,50 );
        addActionListener( new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                execute();
            }
        } );
    }
    @Override
    public void execute () {
        if(frame.operacje.size()-1>=0) {
            if (frame.operacje.get( frame.operacje.size() - 1 ).equals( "Kolor" )) {
                kolor.undo();
            }
            if (frame.operacje.get( frame.operacje.size() - 1 ).equals( "Wysokość" )) {
                wysokość.undo();
            }
            if (frame.operacje.get( frame.operacje.size() - 1 ).equals( "Szerokość" )) {
                szerokość.undo();
            }
            frame.operacje.remove( frame.operacje.size() - 1 );
            frame.wys();
        }
    }

    @Override
    public void undo () {

    }

}
