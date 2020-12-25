package GUI.AWT.components;

import java.awt.*;

//public class ComponentsDemo extends Frame {
//    ComponentsDemo(){
//        Button btn = new Button("Button");
//        btn.setBounds(100,200,80,80);
//        add(btn);
//        setSize(300,300); // size set for frame(container)
//        setLayout(null);
//        setVisible(true);
//    }
//    public static void main(String[] args) {
//        ComponentsDemo cd = new ComponentsDemo();
//    }
//}

public class ComponentsDemo{
    public static void main(String[] args) {
        Frame f = new Frame();
        Button btn = new Button("Button");
        btn.setBounds(100, 50, 80, 30);
        f.add(btn);
        f.setSize(300, 300); // size set for frame(container)
        f.setLayout(null);
        f.setVisible(true);
    }
}
