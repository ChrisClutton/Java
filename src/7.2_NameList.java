import java.util.Scanner;

/* This program prints the names from the array in reverse order */

class NameList
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String [] name = {"Jon", "Narasi", "Felto", "Meira", "Arly", "Fitz", "Vindica", "Victoria", "Luna", "V'ezira"};
        int count;

        for (count = 9; count >=0; count--)
        {
            System.out.println (name [count]);
        }
    }
}
