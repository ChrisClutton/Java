import java.util.Scanner;

/* This program calculates the cost of insurance for a bike depending on the type of bike and owner's age */

class Insurance
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String bike;
        int age;

        //input type of bike
        System.out.print ("Do you have a mountain bike or touring bike (m/t)? ");
        bike = input.next ();

        //input age
        System.out.print ("How old are you? ");
        age = input.nextInt ();
        //output cost of insurance
        if (bike.equals("m"))
        {
            if (age < 25)

                System.out.println ("The cost of insurance is \u00A3 45");

            else

                System.out.println ("The cost of insurance is \u00A3 40");
        }
        else
        {
            if (age < 25)

                System.out.println ("The cost of insurance is \u00A3 35");

            else

                System.out.println ("The cost of insurance is \u00A3 30");
        }
    }
}