import java.util.Scanner;

/* this program tells you if a student's mark constitutes a pass or fail for a variable number of students */

class  StudentMarks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int count, students, mark; //set variables for loop count, number of students and marks

        count = 0; //set inital values for loop count to 0

        System.out.println ("Please enter the number of students");
        students = input.nextInt (); //captures number of students for loop

        for (count = 1; count <= students; count++)
        {
            System.out.println ("Please enter the student's mark");
            mark = input.nextInt (); //captures mark for student

            if (mark >= 40)
                System.out.println ("This student passed with a mark of " + mark);
            else
                System.out.println ("This student failed with a mark of " +mark);
        }
        System.out.println ("End of program. Thank you");
    }
}
