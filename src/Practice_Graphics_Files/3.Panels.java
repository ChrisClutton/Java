package Practice_Graphics_Files;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* Program for colour panels */

class Panels extends JPanel {
    JPanel upperLeft, upperRight, lowerLeft, lowerRight;
    int x = 0;

    public Panels() {
        this.setLayout(new GridLayout(2, 2));

        upperLeft = new JPanel();
        upperLeft.setBackground(Color.RED);
        this.add(upperLeft);

        upperRight = new JPanel();
        upperRight.setBackground(Color.BLUE);
        this.add(upperRight);

        lowerLeft = new JPanel();
        lowerLeft.setBackground(Color.GREEN);
        this.add(lowerLeft);

        lowerRight = new JPanel();
        lowerRight.setBackground(Color.YELLOW);
        this.add(lowerRight);

        Event e = new Event();
        upperLeft.addMouseListener(e);
        upperRight.addMouseListener(e);
        lowerLeft.addMouseListener(e);
        lowerRight.addMouseListener(e);

    }

    public class Event implements MouseListener {

        public void mouseClicked(MouseEvent e) {
            if(x==0) {
                upperLeft.setBackground(Color.BLACK);
                upperRight.setBackground(Color.BLACK);
                lowerLeft.setBackground(Color.BLACK);
                lowerRight.setBackground(Color.BLACK);
                x = 1;
            } else if(x==1) {
                upperLeft.setBackground(Color.RED);
                upperRight.setBackground(Color.BLUE);
                lowerLeft.setBackground(Color.GREEN);
                lowerRight.setBackground(Color.YELLOW);
                x = 0;
            }
        }

        public void mousePressed(MouseEvent e) {

        }

        public void mouseReleased(MouseEvent e) {

        }

        public void mouseEntered(MouseEvent e) {

        }

        public void mouseExited(MouseEvent e) {

        }
    }
}

