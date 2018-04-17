import java.util.Scanner;

/* This program calculates your age in the year 2050 */

class Age2050
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int yearOfBirth, ageIn2050;

        //Input year of birth
        System.out.println ("Please enter your year of birth ");
        yearOfBirth = input.nextInt ();
        //Calculate age in 2050
        ageIn2050 = 2050 - yearOfBirth;

        //Display age in 2050
        System.out.println ("In 2050, you'll be " + ageIn2050);
    }
}