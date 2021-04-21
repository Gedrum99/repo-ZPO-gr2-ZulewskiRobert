package z4.obserwator;

import java.awt.*;

public class Punkt {
    private int x;
    private int y;
    private Color color=java.awt.Color.WHITE;

    public Punkt (int x,int y) {
        this.x = x;
        this.y=y;
    }

    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }

    public void draw(Graphics g){
        g.setColor( color );
        g.fillOval( x,y,4,4 );
    }
}
