import java.util.Scanner;

/* This program allows a user to type in five numbers, four savings account balances, and a percentage bonus. The
program adds this percentage to each balance and outputs it for each saver. The functions for entering, updating and
outputting the balances are completed by separate methods*/

class moreBonus
{
    public static double [] bonusCalc(double[] b)
    {
        Scanner input = new Scanner(System.in);

        double percentage; //set variable for bonus percentage
        int count;         //set variable for array location

        System.out.print ("Please enter the bonus percentage: ");
        percentage = input.nextDouble();

        for (count = 0; count< 4; count++) {
            b[count] = b[count] + (b[count] * (percentage / 100));
        }
        return b;
    }


    public static void output(double[] b, int c)
    {

        bonusCalc(b); //send balance array to bonusCalc method so bonus can be added

        for (c = 0; c < 4; c++)
        {
            System.out.println ("The new balance for saver " + (c+1) + " is \u00A3" + b[c]);
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[] balance = new double[4]; //variables for balances
        int count;                        //variable for array location

        for (count = 0; count < 4; count++)
        {
            System.out.print("please input the balance for saver " + (count + 1) + ": ");
            balance[count] = input.nextDouble();
        }

        output(balance, count); //send balance array to output method

        System.out.println("End of program, thank you.");
    }
}