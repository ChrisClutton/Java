package Practice_Graphics_Files;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* Program for random colour panels */

class RandomColorPanel extends JPanel {

    public RandomColorPanel() {
        setBackground(randomColor());
        addMouseListener(new Event());
    }

    public class Event extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            setBackground(randomColor());
        }
    }

    public Color randomColor() {
        int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        return(new Color(red, green, blue));
    }
}
