package GUI.AWT.checkbox;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxDemo1 {
    CheckBoxDemo1(){
        Frame f = new Frame();

        Label l = new Label();
        l.setBounds(20,200,180,20);
        l.setText("Non-veg : checked");

        Checkbox cb = new Checkbox("Non-veg",true);
        cb.setBounds(20,30,80,30);

        Checkbox cb1 = new Checkbox("Veg");
        cb1.setBounds(200,30,80,30);

        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("Non-veg : "+(e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("Veg : "+(e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        f.add(cb);f.add(cb1);f.add(l);
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxDemo1();
    }
}
