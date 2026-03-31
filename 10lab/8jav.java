import java.applet.Applet;
import java.awt.*;

public class Task8 extends Applet implements Runnable {
    int x = 0;

    public void init() {
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            x += 5;
            if (x > getWidth()) x = 0;
            repaint();
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.fillOval(x, 50, 30, 30);
    }
}