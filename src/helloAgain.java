import java.util.Scanner;

/* This program outputs the message "Hello World" a variable number of times */

class helloAgain
{
    public static void helloWorld (int count)
    {
        if (count <1)
            return;

        System.out.println ("Hello World!");
        helloWorld(count-1);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n;

        //capture number of times message is to be printed
        System.out.println("Please enter the number of times you want the message printed:");

        n = input.nextInt ();

        helloWorld(n);

        System.out.println (" ");
        System.out.println ("End of program. Thank you.");

    }
}
