package Practice_GUI_Files;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/* Add menu to GUI */

class CreateMenu extends JFrame
{
    JMenuBar menubar;
    JMenu file;

    JMenuItem exit;

    public CreateMenu()
    {
        setLayout(new FlowLayout());

        menubar = new JMenuBar();
        setJMenuBar(menubar);

        file = new JMenu("File");
        menubar.add(file);

        exit = new JMenuItem("Exit");
        file.add(exit);

        event e = new event();
        exit.addActionListener(e);
    }

    public class event implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }

    public static void main (String args[])
    {
        CreateMenu gui = new CreateMenu();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300,200);
        gui.setVisible(true);
        gui.setTitle("Menu Tutorial");
    }
}
