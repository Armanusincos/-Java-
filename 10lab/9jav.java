import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task9 extends Applet implements MouseListener {
    int x, y;

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        g.fillOval(x, y, 10, 10);
    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}