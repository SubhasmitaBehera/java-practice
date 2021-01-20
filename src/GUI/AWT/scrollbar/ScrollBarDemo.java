package GUI.AWT.scrollbar;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.FileReader;

public class ScrollBarDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Scroll Bar");

        Label l = new Label("Scroll value : ");
        l.setBounds(30,500,100,30);

        Scrollbar scb = new Scrollbar();
        scb.setBounds(30,50,30,600);
        scb.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l.setText("Scroll value : "+scb.getValue());
            }
        });

        f.add(l);f.add(scb);
        f.setSize(100,700);
        f.setLayout(null);
        f.setVisible(true);
    }
}
