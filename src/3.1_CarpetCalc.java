import java.util.Scanner;

/* This program calculates the area of a room from length and width, and the cost of carpet for the room */

class CarpetCalc
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double length, width, sizeOfCarpet, cost;

        //input length and width
        System.out.println ("Input the length of the room ");
        length = input.nextDouble();
        System.out.println ("Input the width of the room ");
        width = input.nextDouble();

        //calculate size
        sizeOfCarpet = length * width;

        //calculate cost
        cost = sizeOfCarpet * 5;

        //display size and cost
        System.out.println("Carpet needed = " + sizeOfCarpet + " sq.m. " + "Price = \u00A3" + cost);
    }
}
