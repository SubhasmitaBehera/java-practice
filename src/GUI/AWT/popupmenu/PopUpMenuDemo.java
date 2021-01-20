package GUI.AWT.popupmenu;

import java.awt.*;
import java.awt.event.*;

public class PopUpMenuDemo {
    public static void main(String[] args) {
        Frame f = new Frame();

        PopupMenu pum = new PopupMenu();

        MenuItem m1 = new MenuItem("copy");
        m1.setActionCommand("copy");
        MenuItem m2 = new MenuItem("cut");
        m1.setActionCommand("cut");
        MenuItem m3 = new MenuItem("paste");
        m1.setActionCommand("paste");

        pum.add(m1);
        pum.add(m2);
        pum.add(m3);

        Label l = new Label();
        l.setBounds(30, 300, 1000, 30);

        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pum.show(f, e.getX(), e.getY());
            }
        });

        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("Item selected is :- "+m1.getLabel());
            }
        });

        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("Item selected is :- "+m2.getLabel());
            }
        });

        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("Item selected is :- "+m3.getLabel());
            }
        });

        f.add(pum);
        f.add(l);
        f.setSize(1200, 1200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
