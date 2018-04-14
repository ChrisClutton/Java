import java.util.Scanner;

/* this program asks people how they sweeten their coffee
	The three possible answers are: I don't know, With sugar, or With sweetener.
	At the end of the program, a report of the survey is listed, showing results*/

class  EvenMoreCoffee
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int preference, nothing, sugar, sweetener, person;

        nothing = sugar = sweetener = person = 0; //set all these to 0

        System.out.println("How do you sweeten your coffee?");
        System.out.println("1. I don't");
        System.out.println("2. With sugar?");
        System.out.println("3. With sweetener?");
        System.out.println("4. Quit");

        preference = input.nextInt ();

        while (preference !=4)
        {
            person++;
            if (preference ==1)
                nothing++; //increment it!
            else if (preference ==2)
                sugar++; //increment it!
            else if (preference ==3)
                sweetener++; //increment it!

            //ask next person to continue loop
            System.out.println("How do you sweeten your coffee?");
            System.out.println("1. I don't");
            System.out.println("2. With sugar?");
            System.out.println("3. With sweetener?");
            System.out.println("4. Quit");

            preference = input.nextInt ();
        }
        System.out.println("Survey Report");
        System.out.println("=============");

        if (person ==1)
            System.out.println("1 person was surveyed:");
        else
            System.out.println(person + " people were surveyed:");

        if (nothing ==1)
            System.out.println("1 person doesn't sweeten coffee");
        else
            System.out.println(nothing + " people don't sweeten coffee");
        if (sugar ==1)
            System.out.println("1 person uses sugar in coffee");
        else
            System.out.println(sugar + " people use sugar in coffee");
        if (sweetener ==1)
            System.out.println("1 person uses sweetener in coffee");
        else
            System.out.println(sweetener + " people use sweetener in coffee");
        //consideration taken to ensure correct english used for 1 person
    }
}