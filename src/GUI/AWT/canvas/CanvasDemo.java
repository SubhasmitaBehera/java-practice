package GUI.AWT.canvas;

import java.awt.*;

public class CanvasDemo extends Canvas {
    public static void main(String[] args) {
        Frame f = new Frame("Canvas Demo");
        Canvas c = new Canvas(){
            public void paint (Graphics g){
                Font f = new Font("TimesNewRoman", Font.BOLD, 40);
                g.setColor(Color.BLACK);
                g.setFont(f);
                g.drawString("BABLU", 80, 165);
                g.drawRoundRect(80, 40, 190, 140, 40, 40);
            }
        };

        c.setBackground(Color.CYAN);
        c.setBounds(60, 60, 300, 300);
        f.add(c);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
