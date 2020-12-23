package GUI.AWT.choice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        Choice c = new Choice();
        c.setBounds(20, 150, 180, 30);
        c.add("Mughlai");
        c.add("Lollipop");
        c.add("Chicken-Kassa");
        c.add("Sizzling-brownie");

        Button btn = new Button("Show");
        btn.setBounds(240,150,80,30);

        Label l = new Label();
        l.setBounds(60,80,180,50);
        l.setText("Item selected is : ");

        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("item selected is : "+c.getItem(c.getSelectedIndex()));
            }
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("Item selected is : "+c.getItem(c.getSelectedIndex()));
            }
        });

        f.add(c);f.add(btn);f.add(l);
        f.setBounds(300,300,400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
