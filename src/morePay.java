import java.util.Scanner;

/* This program calculates the gross and net pay for a variable number of workers and outputs the results in a payslip
 * several methods are used to output the payslip and calculate gross pay, tax and net pay */

class morePay
{
    //calculate net pay
    public static double netCalc (double gP, double t)
    {
    return (gP - t);
    }

    public static double taxCalc (double gP, String m)
    {
        //calculate payable tax based on marital status
        if (m.equals ("y"))
            return (gP * 0.25);
        else
            return (gP * 0.3);
    }

    public static double grossCalc (double h, double sP, double oP)
    {
        //calculate gross pay, taking overtime hours into consideration
        if (h <= 40)
            return (h*sP);
        else
            return ((h-40)*oP)+(40*sP);
    }

    public static void payslip (int n)
    {
        Scanner input = new Scanner(System.in);

        if (n<1)
            return;

        String name, married;
        double hours, standardPay, overtimePay, grossPay, tax, netPay;

        System.out.println ("Please enter the employee's name:"); //capute worker name
        name = input.next ();

        System.out.println ("Please enter the number of hours worked:"); //capture number of hours worked
        hours = input.nextDouble ();

        System.out.println ("Please enter the standard rate of pay:"); //capture the standard rate of pay
        standardPay = input.nextDouble ();

        System.out.println ("Please input the overtime rate of pay"); //capture the overtime rate of pay
        overtimePay = input.nextDouble ();

        System.out.println ("Please confirm if the employee is married (y/n)"); //capture marital status
        married = input.next ();

       grossPay = grossCalc (hours,standardPay, overtimePay); //send data to method to calculate gross pay
       tax = taxCalc (grossPay, married); //send data to method to calculate tax
       netPay = netCalc (grossPay, tax); //send data tp method to calculate net pay

        //payslip printing
       System.out.println ("=====================");
       System.out.println ("Payslip for " + name + ":");
       System.out.println ("=====================");
       System.out.println ("Married: " + married);
       System.out.println ("Total hours worked: " + hours);
       System.out.println ("Standard rate of pay: " + standardPay);
       System.out.println ("Overtime rate of pay: " + overtimePay);
       System.out.println ("Gross Pay: \u00A3" + grossPay);
       System.out.println ("Tax: \u00A3" + tax);
       System.out.println ("Net Pay: \u00A3" + netPay);
       System.out.println ("");

       payslip (n-1);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println ("Please enter the number or workers:"); //capture number of workers
        number = input.nextInt ();

        payslip(number); //send data to payslip method for output

        System.out.println ("End of Program. Thank you.");
    }
}
