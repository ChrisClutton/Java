

/* The Motorcycle class */

class Motorcycle extends Vehicle
{
    private String bikeType;
    private int engineSize;

    Motorcycle (String plate, String colour, int year, int value, String bikeType, int engineSize)
    {
        super (plate, colour, year, value); //super class constructor

        this.bikeType = bikeType;
        this.engineSize = engineSize;
    }
    public String toString()
    {
        return super.toString()+bikeType+" "+engineSize;
    }

    String getBikeType ()
    {
        return bikeType;
    }

    int getEngineSize ()
    {
        return engineSize;
    }
}
