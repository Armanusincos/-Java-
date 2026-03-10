import javax.swing.*;
import java.awt.*;

public class GraphLab extends JPanel {

    int task = 7; // номер задания (меняй 1–7)

    public void paint(Graphics g) {

        int w = getWidth();
        int h = getHeight();

        int cx = w / 2;
        int cy = h / 2;

        int scale = 40;

        g.setColor(Color.BLACK);

        g.drawLine(0, cy, w, cy);
        g.drawLine(cx, 0, cx, h);

        g.setColor(Color.RED);

        int px = 0;
        int py = 0;

        for (int i = 0; i < w; i++) {

            double x = (i - cx) / (double) scale;
            double y = 0;

            switch (task) {

                case 1: y = 0.5 * x; break;          // y = kx
                case 2: y = 3 * x * x; break;        // y = 3x²
                case 3: y = -x * x + x * x * x; break; // y = −x² + x³
                case 4: y = x * x * x + x * x + x; break; // y = x³ + x² + x
                case 5: y = Math.pow(x,5); break;    // y = x⁵
                case 6: y = Math.sin(x); break;      // y = sin x
                case 7: y = Math.cos(x - 1) + x; break; // y = cos(x−1)+x

            }

            int sy = cy - (int)(y * scale);

            if(i>0) g.drawLine(px,py,i,sy);

            px=i;
            py=sy;
        }
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Графики функций");

        GraphLab panel = new GraphLab();

        f.add(panel);
        f.setSize(800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}