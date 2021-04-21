package z4;

import z4.obserwator.*;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String []args){
        JFrame frame = new JFrame("Punkty");
        MainWindow click=new MainWindow();
        click.addMouseListener( new ClickListener( click ) );
        PanelSlupkow slup = new PanelSlupkow();
        PanelZliczajacy licz=new PanelZliczajacy();
        PanelWspolrzednych wsp=new PanelWspolrzednych();
        click.dodajObserwatora( licz );
        click.dodajObserwatora( wsp );
        click.dodajObserwatora( slup );


        frame.setSize( 800,600 );
        frame.setResizable( false );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setLayout( null );


        frame.add(licz);
        frame.add(wsp);
        frame.add(slup);
        frame.add(click);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible( true );
    }
}
