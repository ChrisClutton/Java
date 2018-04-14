import java.util.Scanner;

/* This program asks for the capital city of France and congratulates the user if the
correct answer is given */

class france
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String s;

        //input capital city of France
        System.out.print ("What is the capital of France?");
        s = input.next ();

        while (!s.equals ("Paris"))
        {
            //output congratulations if input is correct and ask to try again if incorrect
            System.out.println ("incorrect");
            System.out.println ("What is the capital of France");
            s = input.next ();
        }
        System.out.println ("tres bien!");
    }
}
