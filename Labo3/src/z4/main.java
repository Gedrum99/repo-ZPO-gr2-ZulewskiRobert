package z4;

import z4.obserwator.*;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String []args){
        JFrame frame = new JFrame("Punkty");
        frame.setLayout( null);
        frame.setPreferredSize( new Dimension(900,600) );
        frame.setMinimumSize( new Dimension(900,600) );
        frame.setMaximumSize( new Dimension(900,600) );
        MainWindow click=new MainWindow();
        click.addMouseListener( new ClickListener( click ) );
        BarChart slup = new BarChart();
        PanelZliczajacy licz=new PanelZliczajacy();
        PanelWspolrzednych wsp=new PanelWspolrzednych();


        click.dodajObserwatora( licz );
        click.dodajObserwatora( wsp );
        click.dodajObserwatora( slup );

        frame.setResizable( false );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        frame.add(click,BorderLayout.LINE_START);
        frame.add(licz,BorderLayout.LINE_END);
        frame.add(wsp,BorderLayout.LINE_END);
        frame.getContentPane().add(slup,BorderLayout.LINE_END);
        frame.setVisible( true );
    }
}
