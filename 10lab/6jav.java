import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task6 extends Applet implements ActionListener {
    TextField tf;
    String msg = "";

    public void init() {
        tf = new TextField(10);
        Button b = new Button("OK");
        add(tf);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        msg = "Привет, " + tf.getText();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}