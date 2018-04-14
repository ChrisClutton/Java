import java.util.Scanner;

/* this program counts the total passes, fails and the average grade for students taking a test */

class  moreStudentMarks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double mark, students, pass, fail, average; //set variables for student mark, number of students, passes, fails and average grade

        students = pass = fail = average = 0; //set these values to 0

        System.out.println ("Please enter the student's mark");

        mark = input.nextDouble (); //captures mark for student

        while (mark != -1)
        {
            students++;
            average = average+mark;

            if (mark >= 40)
                pass++;
            else
                fail++;

            System.out.println ("Please enter the student's mark");

            mark = input.nextDouble (); //captures next mark
        }

        System.out.println ("TEST RESULTS");
        System.out.println ("============");

        if (students == 0)
            System.out.println ("No students took the test");
        else if (students == 1)
        {
            System.out.println ("one student took the test");
            System.out.println ("thier mark was " + mark);
        }
        else
        {
            System.out.println (students + "students took the test");
            System.out.println (pass + "students passed");
            System.out.println (fail + "students failed");
            System.out.println ("The average mark was " + (average/students));
        }
    }
}
