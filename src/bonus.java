import java.util.Scanner;

/* This program allows a user to type in five numbers, four savings account balances, and a percentage bonus. The
program adds this percentage to each balance and outputs it for each saver. */

class bonus
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double [] balance = new double [4]; //variables for balances
        int count;                          //variable for array location
        double percentage;                  //variable for percentage multiplier

        System.out.print ("Please enter the bonus percentage: ");
        percentage = input.nextDouble ();

        for (count = 0; count < 4; count++)
        {
            System.out.print ("please input the balance for saver " + (count+1) + ": ");
            balance [count] = input.nextDouble ();
        }

        for (count = 0; count < 4; count++)
        {
            System.out.println ("The new balance for saver " + (count+1) + " is \u00A3" + (balance [count] + (balance [count] * (percentage/100))));
        }
        System.out.println ("End of program, thank you.");
    }
}
