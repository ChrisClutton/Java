import java.util.Scanner;

/* this program is for a higher or lower guessing game. The program tells you if your guess is higher or lower that the required answer and records the number of attempts */

class  higherOrLower
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //set variables for number to be guessed, the guess and number of guesses used
        int number, guess, count;

        //set vartiables to 0
        number=guess=count=0;

        //enter number to be guessed
        System.out.println ("Please enter the number to be guessed:");
        number = input.nextInt ();

        //enter guess and increment guess count
        System.out.println ("Please enter your guess:");
        guess = input.nextInt ();
        count++;

        while (guess != number)
        {
            if (guess<number)
                System.out.println ("Guess Higher!");
            else
                System.out.println ("Guess Lower!");

            System.out.println ("Please enter your guess:");
            guess = input.nextInt ();
            count++;
        }
        if (count == 1)
            System.out.println ("Well done! You got it right first time!");
        else
            System.out.println ("well done! You only needed " + count + " guesses!");
    }
}