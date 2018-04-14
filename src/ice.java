import java.util.*;

/* This program takes an array of six numbers, which represent scores in an ice skating competition. Once all scores
 * have been entered, it orders them and omits the highest and lowest scores, then averages the middle 4 scores. */

class ice
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double [] scores = new double [6];
        int count;
        double total = 0;

        for (count = 0; count < 6; count++)
        {
            System.out.print ("please input the score for judge " + (count+1) + ": ");
            scores [count] = input.nextDouble ();
        }

        Arrays.sort (scores);

        for (count = 1; count < 5; count++)
        {
            total = total + scores[count];
        }

        System.out.println ("Average: " + (total/4.0));
    }
}
