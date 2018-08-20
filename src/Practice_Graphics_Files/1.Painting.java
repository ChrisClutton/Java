package Practice_Graphics_Files;

import javax.swing.*;
import java.awt.*;

/* Graphics Painting program */

class Painting extends JPanel {

    public Painting() {
        setBackground(Color.YELLOW);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 100, 100);
        g.drawString("This is a string", 150, 20);
        g.fillOval(50, 200, 30, 60);

        g.setColor(Color.GREEN);
        g.drawString("Hellot there", 200, 200);
        g.drawRect(70, 120, 20, 30);

        g.setColor(Color.RED);
        g.drawRect(150, 150, 30, 30);
    }
}

