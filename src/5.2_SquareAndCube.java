import java.util.Scanner;

/* this program asks the user to enter a number, calculates and outputs the square and cube the number for seven numbers */

class SquareAndCube
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count, number; //variables for input count and number input

        count = 0; //set initial count to zero
        for (count = 1; count <=7; count++)
        {
            System.out.println("Please enter a number");

            number = input.nextInt ();

            System.out.println(number + " squared is " + number*number + " and cubed is " +number*number*number); //calculate and output square and cube of input
        }
        System.out.println("End of Program. Thank you");

    }
}
