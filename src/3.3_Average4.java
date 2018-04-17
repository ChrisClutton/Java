import java.util.Scanner;

/* This program calculates the average of 4 numbers */

class average4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double one, two, three, four, average;

        //input 4 numbers
        System.out.println ("Please input the first number ");
        one = input.nextDouble ();
        System.out.println ("Please input the second number ");
        two = input.nextDouble ();
        System.out.println ("Please input the third number ");
        three = input.nextDouble ();
        System.out.println ("Please input the fourth number ");
        four = input.nextDouble ();

        //calculate average of numbers
        average = (one + two + three + four)/4;

        //output average of numbers
        System.out.println ("The average of the four numbers is " + average);
    }
}
