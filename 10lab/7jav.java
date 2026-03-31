import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task7 extends Applet implements ActionListener {
    Color color = Color.BLACK;

    public void init() {
        addButton("Red");
        addButton("Green");
        addButton("Blue");
    }

    void addButton(String name) {
        Button b = new Button(name);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Red")) color = Color.RED;
        if (e.getActionCommand().equals("Green")) color = Color.GREEN;
        if (e.getActionCommand().equals("Blue")) color = Color.BLUE;
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(50, 100, 50, 50);
    }
}