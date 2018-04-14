import java.util.Scanner;

/* this program calculates the total and average commission for 10 sales staff */

class commission
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double count, commission, totalCommission; //set variables for loop count and commission values

        count = totalCommission	= 0; //set initial values for count and total commission to 0
        for (count = 1; count <=10; count++)
        {
            System.out.println("Please enter a commission amount");

            commission  = input.nextDouble (); //input a commission amount

            totalCommission = totalCommission + commission; //add commission entered to running total
        }
        System.out.println ("The total commission earned is \u00A3" + totalCommission + ", and the average commission earned is \u00A3" + (totalCommission/10)); //output total and average  commission
    }
}
