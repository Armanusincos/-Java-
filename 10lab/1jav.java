import java.applet.Applet;
import java.awt.Graphics;

public class Task1 extends Applet {
    public void paint(Graphics g) {
        g.drawRect(20, 20, 100, 50);
        g.drawString("Прямоугольник", 20, 90);

        g.drawOval(150, 20, 50, 50);
        g.drawString("Круг", 150, 90);

        g.drawLine(20, 120, 200, 120);
        g.drawString("Линия", 20, 140);
    }
}