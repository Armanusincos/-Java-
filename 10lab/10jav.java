import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task10 extends Applet implements ActionListener {
    TextField tf;
    String text = "";
    Color color = Color.BLACK;

    public void init() {
        tf = new TextField(10);
        Button b = new Button("OK");
        add(tf);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        text = tf.getText();
        color = new Color((int)(Math.random()*255),
                          (int)(Math.random()*255),
                          (int)(Math.random()*255));
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(50, 80, 100, 50);
        g.setColor(Color.BLACK);
        g.drawString(text, 50, 150);
    }
}