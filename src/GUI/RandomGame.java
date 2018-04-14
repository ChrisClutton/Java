package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* Random number game with GUI */

class RandomGame extends JFrame implements ActionListener
{
    int randomNum, guess, guessCount;
    private JButton button;
    private JTextField textField;
    private JLabel promptLabel;
    private JLabel resultLabel;
    private JLabel randomLabel;

    public RandomGame()
    {
        setLayout(new FlowLayout());

        promptLabel = new JLabel("Enter a random number from 1 to 100");
        add(promptLabel);

        textField = new JTextField(5);
        add(textField);

        button  = new JButton("Guess");
        add(button);

        resultLabel = new JLabel("");
        add(resultLabel);

        randomLabel = new JLabel("");
        add(randomLabel);

        randomNum = (int)(Math.random()*100 + 1);

        button.addActionListener(this);

        guessCount = 1;
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            guess = (int)(Double.parseDouble(textField.getText()));

            if(guess == randomNum)
            {
                if(guessCount == 1)
                {
                    resultLabel.setText("You won the game in one guess!");
                    randomLabel.setText("The random number generated was " + randomNum);
                }
                else
                {
                    resultLabel.setText("You won the game in " + guessCount + " guesses!");
                    randomLabel.setText("The random number generated was " + randomNum);
                }
            }
            else if (guess < randomNum)
            {
                resultLabel.setText("Guess Higher!");
                guessCount++;
            }
            else
            {
                resultLabel.setText("Guess Lower!");
                guessCount++;
            }
        }
        catch(Exception ex)
        {
            randomLabel.setText("Please enter numbers only");
        }
    }

    public static void main (String args[])
    {
        RandomGame gui = new RandomGame();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(300, 150);
        gui.setTitle("Random Number Guessing Game");
    }
}