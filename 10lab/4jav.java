import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task4 extends Applet implements ActionListener {
    String msg = "";

    public void init() {
        Button b = new Button("Нажми");
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        msg = "Кнопка нажата!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}