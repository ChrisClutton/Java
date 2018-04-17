import java.util.Scanner;

/* This program calculates the amount of pay for a given day based on the number of hours worked */

class Payday
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double standard, overtime;
        String day;

        //enter for day of the week
        System.out.print ("Is it Sunday (y/n)? ");
        day = input.next ();

        //input standard and overtime hours worked
        System.out.print ("Please enter the number of standard hours worked ");
        standard = input.nextDouble ();
        System.out.print ("Please enter the number of overtime hours worked ");
        overtime = input.nextDouble ();

        //calculate and output total pay
        if (day == "y")
        {
            System.out.println ("Total pay earned is \u00A3" + (standard*15 + overtime*20));
        }
        else
        {
            System.out.println ("Total pay earned is \u00A3" + (standard*8 + overtime*12));
        }
    }

}
