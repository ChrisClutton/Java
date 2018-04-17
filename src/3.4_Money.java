import java.util.Scanner;

/* This program counts the number of £5, £10 and £20 notes you have and calculates their total */

class Money
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int five, ten, twenty, total, totalSum;

        //input number of £5 notes
        System.out.print ("Please input the number of \u00A35 notes ");
        five = input.nextInt ();

        //input number of £10 notes
        System.out.print ("Please input the number of \u00A310 notes ");
        ten = input.nextInt ();

        //input number of £20 notes
        System.out.print ("Please input the number of \u00A320 notes ");
        twenty = input.nextInt ();

        //calculate total number of notes
        total = five + ten + twenty;

        //calculate total value of notes
        totalSum = (five*5) + (ten*10) + (twenty*20);

        //output total number and value of notes
        System.out.print("The total number of notes is " + total + ", and their value is \u00A3" + totalSum);
    }
}
