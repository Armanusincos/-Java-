import java.applet.Applet;
import java.awt.*;

public class Task2 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(20, 20, 50, 50);

        g.setColor(Color.GREEN);
        g.fillOval(100, 20, 50, 50);

        g.setColor(Color.BLUE);
        g.drawLine(20, 100, 200, 100);
    }
}