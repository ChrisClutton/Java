import java.util.Scanner;

/* This program calculates the average marks for students and outputs whether they passed or failed */

class  moduleMarks
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        //set variables for Student Name, total and average marks and mark count
        String student;
        double grade, average;
        int count;

        //set variables for total and average grades to 0
        grade=average=count=0;

        //enter student name
        System.out.println ("Please enter the student name (Type \"End\" to end):");
        student = input.next ();

        while (!student.equals ("End"))
        {
            for (count = 1; count <=6; count++)
            {
                //enter student grades
                System.out.println ("Please enter a mark: ");

                grade = input.nextDouble ();
                //add mark to running total
                average = average + grade;
            }
            //calculate average mark
            average = average/6;

            //output if average mark is a pass or fail
            if (average>=40)
                System.out.println (student + " passed. Congratulations!");
            else
                System.out.println (student + " failed. Sorry!");

            //reset average to 0
            average=0;

            System.out.println ("Please enter the student name (Type \"End\" to end):");
            student = input.next ();
        }
        System.out.println ("End of Program. Thank you.");
    }
}
