package z4.obserwator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JPanel implements Podmiot{
    private List<Obserwator> obserwujacy=new ArrayList<>();
    private List<Punkt> punkty=new ArrayList<>();

    public MainWindow(){
        super();
        setBounds( 0,0,600,600 );
        setPreferredSize( new Dimension(600,600 ));

        setBackground( Color.black );
    }

    public void dodajPkt(Punkt p){
        punkty.add( p );
        this.repaint();
    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent( g );
        for (Punkt p:punkty)
        {
            p.draw( g );
        }
    }

    @Override
    public void dodajObserwatora (Obserwator obserwator) {
        obserwujacy.add(obserwator);
    }

    @Override
    public void usunObserwatora (Obserwator obserwator) {
        obserwujacy.remove( obserwator );
    }

    @Override
    public void aktualizujObserwatora () {
        for(Obserwator o:obserwujacy)
        {
            o.aktualizuj(punkty);
        }
    }
}
