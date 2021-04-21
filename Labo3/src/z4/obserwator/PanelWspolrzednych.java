package z4.obserwator;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelWspolrzednych extends JPanel implements Obserwator{

    public PanelWspolrzednych () {
        super();
        setBounds( 500,100,300,300 );
        setBackground( Color.red );
    }


    @Override
    public void aktualizuj (List<Punkt>p) {

    }
}
