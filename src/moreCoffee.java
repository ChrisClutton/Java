import java.util.Scanner;

/* this program asks five people how they sweeten their coffee The three possible answers are: I don't know, With sugar,
 or With sweetener. At the end of the program, a report of the survey is listed, showing results*
 */

class moreCoffee
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int person, preference, nothing, sugar, sweetener, invalid;

        nothing = sugar = sweetener = 0; //set all these to 0
        for (person = 1; person <=5; person++)
        {
            System.out.println("How do you sweeten your coffee?");
            System.out.println("1. I don't");
            System.out.println("2. With sugar?");
            System.out.println("3. With sweetener?");

            preference = input.nextInt ();

            if (preference ==1)
                nothing++; //increment it!
            else if (preference ==2)
                sugar++;
            else if (preference ==3)
                sweetener++;
            else
                person--; //undo increment to person integer if invalid selection
        }
        System.out.println("Survey Report");
        System.out.println("=============");

        if (nothing ==1)
            System.out.println(nothing + " person doesn't sweeten coffee"); //consideration taken to ensure correct english used for 1 person
        else
            System.out.println(nothing + " people don't sweeten coffee");
        if (sugar ==1)
            System.out.println(sugar + " person uses sugar in coffee");  //consideration taken to ensure correct english used for 1 person
        else
            System.out.println(sugar + " people use sugar in coffee");
        if (sweetener ==1)
            System.out.println(sweetener + " person uses sweetener in coffee");  //consideration taken to ensure correct english used for 1 person
        else
            System.out.println(sweetener + " people use sweetener in coffee");

        //consideration taken to ensure correct english used for 1 person

    }
}
