import java.util.Scanner;

/* this program answers question 2 of the week 2 test */

class recursion
{
    public static void odds (int x)
    {
        int y=x%2;

        if (y == 0)
            x = x-1;
        if (x <1)
            return;

        System.out.println (x);
        odds(x-2);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println ("Please enter a positive number:");

        int num = input.nextInt ();
        odds(num);
    }
}