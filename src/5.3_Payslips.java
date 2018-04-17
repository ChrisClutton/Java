import java.util.Scanner;

/* this program calculates the gross pay earned for 5 workers */

class Payslips
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count;
        double hours, pay;//variables for input count, number of hours worked and rate of pay

        count = 0; //set initial count to zero
        for (count = 1; count <=5; count++)
        {
            System.out.println("Please enter the number of hours worked");

            hours = input.nextDouble ();

            System.out.println("Please enter the rate of pay");

            pay = input.nextDouble ();

            System.out.println(" The gross pay earned by the worker is \u00A3" + hours*pay); //calculate and output the gross pay for the worker
        }
        System.out.println("End of Program. Thank you");

    }
}
