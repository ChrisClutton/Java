import java.util.Scanner;



class Mystery

{

    public static int what(int w){

        if(w == 1 || w == 2){

            return 1;

        }



        return what(w-1) + what(w -2);

    }





    public static void main(String[] args)

    {

        Scanner input = new Scanner(System.in);

        int number, result;



        System.out.print("Input a number");

        number = input.nextInt();



        for(int i=1; i<=number; i++){

            System.out.print(what(i) +" ");

        }

    }

}