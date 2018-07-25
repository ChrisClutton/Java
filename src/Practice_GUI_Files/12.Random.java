package Practice_GUI_Files;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* Program to change panel colours by clicking on them */

class Random extends JFrame {

    JPanel panel;

    public Random () {
        panel = new JPanel();
        panel.setBackground(randomColor());
        add(panel);

        event e = new event();
        panel.addMouseListener(e);
    }

    public Color randomColor() {

        int r = (int) (Math.random()*256);
        int g = (int) (Math.random()*256);
        int b = (int) (Math.random()*256);
        return(new Color(r,g,b));
    }

    public class event implements MouseListener {

        public void mouseClicked(MouseEvent e) {
            panel.setBackground(randomColor());
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

    public static void main (String args[]) {
        Random gui = new Random();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(300,300);
        gui.setTitle("Random Color Panel");
    }

}
