package GUI.AWT.checkboxgroup;

import java.awt.*;

public class CheckBoxGroupDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Check Box Example");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("veg",false,cbg);
        cb1.setBounds(20,30,80,120);
        Checkbox cb2 = new Checkbox("Non-Veg",false,cbg);
        cb2.setBounds(200,30,80,120);
        f.add(cb1);f.add(cb2);
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
