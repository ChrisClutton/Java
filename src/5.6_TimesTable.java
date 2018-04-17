import java.util.Scanner;

/* this program gives the multiplication table for a given integer between 1 and 100 */

class  TimesTable
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int count, number; // set variables for loop count, input number and miltiplier

        count = 0; //set initial loop count to 0

        System.out.println ("Please enter a number between 1 and 100");
        number  = input.nextInt ();//captures number for multiplication

        if (number >= 1 && number <= 100)
            for (count = 1; count <=12; count++)
                System.out.println (number + " times " + count + " equals " + (number*count)); //calculate and output line of multiplication table
        else
            System.out.println ("Invalid number entered");

    }
}
