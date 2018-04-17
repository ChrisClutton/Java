import java.util.Scanner;

/* The Museum class */

class Museum
{
    static final int quit = 0;
    public static int getMenuOpt()
    {
        Scanner menuOpt = new Scanner (System.in);
        int option;

        System.out.println ("1. Add a car to the museum");
        System.out.println ("2. Add a motorcycle to the museum");
        System.out.println ("3. List all vehicles manufactured in year 'x'");
        System.out.println ("4. List all vehicles of 1 litre (1000cc) or more");
        System.out.println ("5. List all cars in the museum");
        System.out.println ("6. List all motorcycles in the museum");
        System.out.println (quit + ". Quit");

        option = menuOpt.nextInt ();
        return option;
    }

    public static int addCars (Vehicle vehicles [], int vehiclesInMuseum)
    {
        Scanner input = new Scanner (System.in);
        String plate;
        String colour;
        int year;
        int value;
        String engineType;
        int doors;
        int seats;
        int engineSize;

        System.out.print ("Enter the license plate: ");
        plate = input.nextLine ();
        System.out.print ("Enter the colour: ");
        colour = input.nextLine ();
        System.out.print ("Enter the engine type (petrol or diesel): ");
        engineType = input.nextLine ();
        System.out.print ("Enter the year of manufacture: ");
        year = input.nextInt ();
                System.out.print ("Enter the value: ");
        value = input.nextInt ();
        System.out.print ("Enter the number of doors: ");
        doors = input.nextInt ();
        System.out.print ("Enter the number of seats: ");
        seats = input.nextInt ();
        System.out.print ("Enter the engine size in litres(L): ");
        engineSize = input.nextInt ();

        vehicles[vehiclesInMuseum] = new Car(plate, colour, year, value, engineType, doors, seats, engineSize);

        vehiclesInMuseum++;

        return vehiclesInMuseum;
    }
    public static int addMotorcycles (Vehicle vehicles [], int vehiclesInMuseum)
    {
        Scanner input = new Scanner (System.in);
        String plate;
        String colour;
        int year;
        int value;
        String bikeType;
        int engineSize;

        System.out.print ("Enter the license plate: ");
        plate = input.nextLine ();
        System.out.print ("Enter the colour: ");
        colour = input.nextLine ();
        System.out.print ("Enter the type of motorcycle (sports, tourer or trails): ");
        bikeType = input.nextLine ();
        System.out.print ("Enter the year of manufacture: ");
        year = input.nextInt ();
        System.out.print ("Enter the value: ");
        value = input.nextInt ();

        System.out.print ("Enter the engine size in cubic centimetres(cc): ");
        engineSize = input.nextInt ();

        vehicles [vehiclesInMuseum] = new Motorcycle(plate, colour, year, value, bikeType, engineSize);

        vehiclesInMuseum++;

        return vehiclesInMuseum;
    }
    public static void listByYear (Vehicle vehicles [], int vehiclesInMuseum)
    {
        Scanner input = new Scanner (System.in);
        int year;

        System.out.print ("Enter the year: ");
        year = input.nextInt ();

        for (int count = 0; count < vehiclesInMuseum; count++)
        {
            if (vehicles[count].getYear()==year)
                System.out.println (vehicles[count].getPlate());
        }
    }
    public static void listByEngine (Vehicle vehicles [], int vehiclesInMuseum)
    {
        Scanner input = new Scanner (System.in);
        int engineSize;

        System.out.print ("Enter the Engine size (L): ");
        engineSize = input.nextInt ();

        for (int count = 0; count < vehiclesInMuseum; count++)
        {
            if (vehicles[count] instanceof Car)
            {
                if (((Car)vehicles[count]).getEngineSize() >= engineSize)
                    System.out.println( vehicles[count].getPlate());
            }
            else
            {
                if (((Motorcycle)vehicles[count]).getEngineSize() >= engineSize*1000)
                    System.out.println( vehicles[count].getPlate());
            }
        }
    }
    public static void listCars (Vehicle vehicles [], int vehiclesInMuseum)
    {
        for (int count = 0; count < vehiclesInMuseum; count++)
        {
            if (vehicles[count] instanceof Car)
                System.out.println (vehicles[count].toString());
        }
    }
    public static void listMotorcycles (Vehicle vehicles [], int vehiclesInMuseum)
    {
        {
            for (int count = 0; count < vehiclesInMuseum; count++)
            {
                if (vehicles[count] instanceof Motorcycle)
                    System.out.println (vehicles[count].toString());
            }
        }
    }
    public static void main(String[] args)
    {
       Vehicle vehicles [] = new Vehicle[200];
        int vehiclesInMuseum = 0;
        int option;
        option = getMenuOpt();

        while (option != quit)
        {
            if (option == 1)
                vehiclesInMuseum = addCars (vehicles, vehiclesInMuseum);
            else if (option == 2)
                vehiclesInMuseum = addMotorcycles (vehicles, vehiclesInMuseum);
            else if (option == 3)
                listByYear (vehicles, vehiclesInMuseum);
            else if (option == 4)
                listByEngine (vehicles, vehiclesInMuseum);
            else if (option == 5)
                listCars (vehicles, vehiclesInMuseum);
            else if (option == 6)
                listMotorcycles (vehicles, vehiclesInMuseum);
            else System.out.println ("Invalid input; select a number between 1 and 6 or quit:");

            option = getMenuOpt ();
        }
    }
}