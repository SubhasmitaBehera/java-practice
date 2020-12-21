package GUI.AWT.checkbox;

import java.awt.*;

public class CheckBoxDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Check Box Example");
        Checkbox cb = new Checkbox("Non-veg",true);
        cb.setBounds(20,30,80,30);
        Checkbox cb1 = new Checkbox("Veg");
        cb1.setBounds(200,30,80,30);
        f.add(cb);f.add(cb1);
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
