package z4.obserwator;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelZliczajacy extends JPanel implements Obserwator{
    private JLabel licznik;
    public PanelZliczajacy () {
        super();
        JLabel nowy=new JLabel();
        setBackground( Color.WHITE );
        nowy.setText( "Brak punktów" );
        setBounds( 500,0,300,100 );
        nowy.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        nowy.setBounds( 600,280,150,100 );
        licznik=nowy;
        add(licznik);
        setVisible( true );
    }

    @Override
    public void aktualizuj (List<Punkt>p) {
        licznik.setText( "Liczba punktów: "+ Integer.toString( p.size() ) );
    }
}
