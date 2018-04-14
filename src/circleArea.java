import java.util.Scanner;

/* This program calculates the area of a circle with variable radius */

class circleArea
{
    public static double areaCalc(double r)
    {
        return (3.141*r*r);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double radius, area;

        //capture radius of circle
        System.out.println ("Please input the circle'sradius: ");
        radius = input.nextDouble();

        //call on circleArea method

        area = areaCalc(radius);

        System.out.println ("The area of the circle is " + area + ".");

    }
}
