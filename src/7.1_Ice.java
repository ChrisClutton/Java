import java.util.Scanner;

/* This program takes an array of six numbers, which represent scores in an ice skating competition. Once all scores
 * have been entered, it orders them and omits the highest and lowest scores, then averages the middle 4 scores. */

class Ice {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double [] scores = new double [6];
        int count;
        double total = 0;
        double sort;
        boolean sorted = false;

        for (count = 0; count < 6; count++){

            System.out.print ("please input the score for judge " + (count+1) + ": ");
            scores [count] = input.nextDouble ();
        }

        while (!sorted){

            sorted = true;

            for (count = 0; count < 5; count++){

                if (scores[count] > scores[count+1]){

                    sort = scores[count];
                    scores[count] = scores[count+1];
                    scores[count+1] = sort;

                    sorted = false;
                }
            }
        }

        for (count = 1; count < 5; count++){

            total = total + scores[count];
        }

        System.out.println ("Average: " + (total/4.0));
    }
}
