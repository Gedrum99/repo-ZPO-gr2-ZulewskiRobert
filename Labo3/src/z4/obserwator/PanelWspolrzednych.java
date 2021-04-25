package z4.obserwator;

import javafx.geometry.HorizontalDirection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.List;

public class PanelWspolrzednych extends JScrollPane implements Obserwator{
    JPanel panel;
    int wysokość=250;

    public PanelWspolrzednych () {
        super();
        JPanel nowy=new JPanel();
        //setLayout( new BoxLayout(this,BoxLayout.Y_AXIS) );
        //setBounds( 600,50,200,300 );
        nowy.setPreferredSize( new Dimension(300,wysokość ));
        nowy.setBackground( new Color(242,238,203) );
        setBounds( 600,50,300,250 );
        setMinimumSize( new Dimension(300,250) );
        setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED );
        setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        panel=nowy;
        setViewportView( panel );
    }


    @Override
    public void aktualizuj (List<Punkt>p) {
        JLabel button=new JLabel("Punkt "+p.size()+" ( "+ p.get( p.size()-1 ).getX()+" , "+ p.get( p.size()-1 ).getY()+" )");
        button.setAlignmentX( Component.CENTER_ALIGNMENT );
        button.setPreferredSize(new Dimension(150 ,25 ));
        this.wysokość=+p.size()*30;
        panel.setPreferredSize( new Dimension(getWidth(),wysokość) );
        panel.add(button);
    }
}
