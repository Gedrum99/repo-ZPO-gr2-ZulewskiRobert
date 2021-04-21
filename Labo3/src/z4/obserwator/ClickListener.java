package z4.obserwator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickListener extends MouseAdapter {
    private MainWindow panel;

    public ClickListener (MainWindow panel) {
        super();
        this.panel = panel;
    }

    @Override
    public void mouseClicked (MouseEvent e) {
        panel.dodajPkt( new Punkt(e.getX(),e.getY()) );
        panel.aktualizujObserwatora( );
    }
}
