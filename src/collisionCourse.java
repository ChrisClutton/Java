import java.util.Scanner;

/* A character is seven steps from a wall. Move the character towards the wall by repeatedly typing a character and
 * hitting the enter key. When the character hits the wall, output the message: "Ouch!". Use a "k" for the character and
  * a "I--I" string for the wall.*/

class collisionCourse
{
    public static void outputSpaces (int howMany)
    {
        for (int spaces = 1; spaces <= howMany; spaces++)
            System.out.print(" ");
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int step;
        String walk;

        //seven steps overall
        for (step = 1; step <= 7; step++)
        {
            //spaces before, starting from 1 and going up
            outputSpaces(step);

            System.out.print("k");

            //spaces after, starting from 7 and going down
            outputSpaces(7 - step);

            System.out.println ("I--I");

            walk = input.next();
        }

        System.out.println("OUCH!");

    }
}
