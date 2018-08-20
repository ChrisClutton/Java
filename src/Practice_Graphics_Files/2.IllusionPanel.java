package Practice_Graphics_Files;

import java.awt.*;
import javax.swing.*;

/* A program to draw an arrow illusion */

class IllusionPanel extends JPanel {
    public IllusionPanel() {
        setBackground(Color.DARK_GRAY);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);

        //draw top arrow
        g.drawLine(40, 40, 200, 40);
        g.drawLine(40, 40, 60, 20);
        g.drawLine(40, 40, 60, 60);
        g.drawLine(200, 40, 180, 20);
        g.drawLine(200, 40, 180, 60);

        //draw bottom arrow
        g.drawLine(40, 100, 200, 100);
        g.drawLine(40, 100, 20, 80);
        g.drawLine(40, 100, 20, 120);
        g.drawLine(200, 100, 220, 80);
        g.drawLine(200, 100, 220, 120);
    }
}
