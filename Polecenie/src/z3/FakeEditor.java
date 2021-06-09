package z3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FakeEditor extends JPanel {
    public List<String>operacje= new ArrayList<>();

    public FakeEditor(){
        super();
        setBounds( 250, 100, 100,100 );
        setBackground( new Color(244,11,111) );
    }

    public void wys(){
        for(int i=0;i<operacje.size();i++)
        {
            System.out.println(operacje.get( i ));
        }
        System.out.println(operacje.size());
    }

}
