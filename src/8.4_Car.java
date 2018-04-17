

/* The Car class */

class Car extends Vehicle
{
    private String engineType;
    private int doors;
    private int seats;
    private int engineSize;

    Car (String plate, String colour, int year, int value, String engineType, int doors, int seats, int engineSize)
    {
        super (plate, colour, year, value); //super class constructor

        this.engineType = engineType;
        this.doors = doors;
        this.seats = seats;
        this.engineSize = engineSize;
    }
    public String toString()
    {
        return super.toString()+engineType+" "+doors+" "+seats+" "+engineSize;
    }
    String getEngineType ()
    {
        return engineType;
    }

    int getDoors ()
    {
        return doors;
    }

    int getSeats ()
    {
        return seats;
    }

    int getEngineSize ()
    {
        return engineSize;
    }
}
