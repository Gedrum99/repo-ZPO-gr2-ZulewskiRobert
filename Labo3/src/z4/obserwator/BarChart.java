package z4.obserwator;

import z4.obserwator.Punkt;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BarChart extends JScrollPane implements Obserwator
{
    private int histogramHeight = 200;
    private int barWidth = 30;
    private int barGap = 20;

    private JPanel panel;
    private JPanel barPanel;
    private JPanel labelPanel;


    private List<Slupek> bars = new ArrayList<>();

    public BarChart()
    {
        JPanel nowy=new JPanel();
        nowy.setLayout( new BorderLayout() );
        setBounds( 600, 295, 300, 275 );
        setMinimumSize( new Dimension( 300, 275 ) );

        barPanel = new JPanel( new GridLayout(1, 0, barGap, 0) );

        labelPanel = new JPanel( new GridLayout(1, 0, barGap, 0) );

        nowy.add(barPanel, BorderLayout.CENTER);
        nowy.add(labelPanel, BorderLayout.PAGE_END);
        panel=nowy;
        setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_NEVER );
        setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
        setViewportView( panel );

    }

    public void AddColumn(String label, int value, Color color)
    {
        Slupek bar = new Slupek(label, value, color);
        bars.add( bar );
    }

    public void layoutHistogram() {
        barPanel.removeAll();
        labelPanel.removeAll();

        int maxValue = 0;

        for (Slupek bar : bars)
            maxValue = Math.max( maxValue, bar.getValue() );

        for (Slupek bar : bars) {
            JLabel label = new JLabel(bar.getValue() + "");
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            label.setVerticalAlignment(JLabel.BOTTOM);
            int barHeight = (bar.getValue() * histogramHeight) / maxValue;
            Icon icon = new ColorIcon(bar.getColor(), barWidth, barHeight);
            label.setIcon( icon );
            barPanel.add( label );

            JLabel barLabel = new JLabel( bar.getLabel() );
            barLabel.setHorizontalAlignment(JLabel.CENTER);
            labelPanel.add( barLabel );
        }
    }
    @Override
    public void aktualizuj (List<Punkt> p) {
        Color color;
        if (p.size() % 2 == 0) {
            color = Color.green;

        } else {
            color = Color.gray;
        }
        AddColumn( "Punkt " + p.size(), p.get( p.size() - 1 ).getX(), color );
        panel.setPreferredSize( new Dimension(p.size()*80,230) );
        if (p.size() > 5) {
            layoutHistogram();
        }
    }
}