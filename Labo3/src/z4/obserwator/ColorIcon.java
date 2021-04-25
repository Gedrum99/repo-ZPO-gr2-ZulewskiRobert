package z4.obserwator;

import javax.swing.*;
import java.awt.*;

public class ColorIcon implements Icon {

    private Color color;
    private int width;
    private int height;

    public ColorIcon(Color color, int width, int height)
    {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public int getIconWidth()
    {
        return width;
    }

    public int getIconHeight()
    {
        return height;
    }

    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        g.setColor(color);
        g.fillRect(x, y, width, height);
        g.setColor(Color.GRAY);
        g.fillRect(x + width, y, 0, height);
    }
}
