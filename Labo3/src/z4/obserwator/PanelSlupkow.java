package z4.obserwator;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelSlupkow extends JPanel implements Obserwator{
    public PanelSlupkow () {
        super();
        setBackground( Color.YELLOW );
        setBounds( 500,400,300,200 );
    }

    @Override
    public void aktualizuj (List<Punkt>p) {
        System.out.println(p.size());
    }
}
////do zrobienia
