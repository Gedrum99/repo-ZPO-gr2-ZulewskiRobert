package z4.obserwator;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.List;

public class Slupek {
    private String label;
    private int value;
    private Color color;

    public Slupek(String label, int value, Color color)
    {
        this.label = label;
        this.value = value;
        this.color = color;
    }

    public String getLabel()
    {
        return label;
    }

    public int getValue()
    {
        return value;
    }

    public Color getColor()
    {
        return color;
    }
}
