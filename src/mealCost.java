import java.util.Scanner;

/* this program gives a 5% discount on the cost of a meal if it's at least £10 */

class mealCost
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double cost, discountCost;

        //input cost of meal
        System.out.println ("Please enter toe cost of the meal:");
        cost = input.nextDouble();
        discountCost = (cost*0.95);

        //Test if cost of meal is over £10 and output final cost of meal

        if (cost >10)
        {
            System.out.println ("DISCOUNT! The cost of the meal is \u00A3" + discountCost);
        }
        else
        {
            System.out.println ("Sorry, the meal doesn't qualify for a discount. The cost is \u00A3" + cost);
        }
    }
}
