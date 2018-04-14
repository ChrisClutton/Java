import java.util.Scanner;

/* This program calculates the gross and net pay for named workers until the program is ended */

class  Payroll
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String empname;
        double rate, hours; //set variables for employee name, rate of pay and hours worked

        //enter employee name
        System.out.println ("Please enter the employee name (Type \"End\" to end):");
        empname = input.next ();

        while (!empname.equals ("End"))
        {
            //enter employees rate of pay
            System.out.println ("Please enter the employee's rate of pay: ");
            rate = input.nextDouble ();
            System.out.println ("Please enter the number of hours worked: ");
            hours = input.nextDouble ();
            System.out.println ("For " + empname + ", the gross pay is \u00A3" + rate*hours + " and the net pay is \u00A3" + rate*hours*0.7);

            //loop back for next employee
            System.out.println ("Please enter the employee name (Type \"End\" to end):");
            empname = input.next ();
        }
        System.out.println ("End of Program. Thank you.");
    }
}
