import java.util.Scanner;

/* this program asks the user to enter their income and expenditure, then provides advice based on the information provided */

class incomeAndExpenditure
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double income, expenditure;

        //Input income and expenditure
        System.out.print ("Please enter your income ");
        income = input.nextDouble ();
        System.out.print ("Please enter your expenditure ");
        expenditure = input.nextDouble ();

        ////Test for positive disposable income and output advice message depending on result
        if (income > expenditure)
        {
            System.out.println ("SPEND SPEND SPEND!");
        }
        else
        {
            System.out.println ("put some money in the bank!");
        }

    }
}
