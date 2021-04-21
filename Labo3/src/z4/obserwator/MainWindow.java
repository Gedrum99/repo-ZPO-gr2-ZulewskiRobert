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
        setBounds( 0,0,500,600 );
    }

    public void dodajPkt(Punkt p){
        punkty.add( p );
        this.repaint();
    }

    @Override
    public void paint (Graphics g) {
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
