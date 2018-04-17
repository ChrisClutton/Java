import java.util.Scanner;

/* the program calculates the volume of a cylinder with variable radius and height */

class CylinderVolume
{
    public static double areaCalc (double r)
    {
        return (3.141*r*r);
    }
    public static double volumeCalc (double radius, double h)
    {
        return (h * areaCalc(radius));
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double radius, height, volume;

        //capture radius and height of cylinder
        System.out.println ("Please input the circle's radius: ");
        radius = input.nextDouble();

        System.out.println ("Please input the circle's height: ");
        height = input.nextDouble();

        //call on the circleVolume method
        volume = volumeCalc(radius, height);

        System.out.println("The volume of the cylinder is " + volume + ".");

    }
}
