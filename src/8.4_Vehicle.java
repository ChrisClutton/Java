

/* The Vehicle Class */

class Vehicle
{
    private String plate;
    private String colour;
    private int year;
    private int value;

    Vehicle (String plate, String colour, int year, int value)
    {
        this.plate = plate;
        this.colour = colour;
        this.year = year;
        this.value = value;
    }

    public String toString()
    {
        return plate+" "+colour+" "+year+" "+value;
    }

    String getPlate ()
    {
        return plate;
    }

    String getColour ()
    {
        return colour;
    }

    int getYear ()
    {
        return year;
    }

    int getValue ()
    {
        return value;
    }
}