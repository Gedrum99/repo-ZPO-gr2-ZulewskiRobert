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
        setBounds( 600,0,300,50 );
        nowy.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        setPreferredSize( new Dimension(150,50 ));

        licznik=nowy;
        add(licznik);
        setVisible( true );
    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent( g );
    }

    @Override
    public void aktualizuj (List<Punkt>p) {
        licznik.setText( "Liczba punktów: "+ Integer.toString( p.size() ) );
    }
}
