package GUI.AWT.textarea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaDemo extends Frame{

    TextAreaDemo(){
        TextArea textArea = new TextArea();
        textArea.setBounds(20,100,800,500);

        Label l1 = new Label("Words : ");
        l1.setBounds(100,40,160,10);

        Label l2 = new Label("Character : ");
        l2.setBounds(500,40,160,10);

        Button b = new Button("calculate");
        b.setBounds(380,630,80,30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String count = textArea.getText();
                String[] words = count.split(" ");
                int wordsss = words.length;
                l1.setText("Words : "+wordsss);
                int characters = count.length();
                l2.setText("Character : "+characters);
            }
        });


        add(textArea);add(l1);add(l2);add(b);
        setSize(900,800);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaDemo();
    }
}
