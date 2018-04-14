import java.util.Scanner;

class LooseChangeC
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // declare variable for change
        int change=0;
        // ***Change for B - add £50 - £20 notes and £2 coin*** declare variables to store how many coins we are using
        int fiftyPounds,twentyPounds, tenPounds, fivePounds, twoPounds, pounds, fifties, twenties, tens, fives, twos, ones;

        //***Change for C - add number of each note available***

        int fiftyPoundsNum,twentyPoundsNum, tenPoundsNum, fivePoundsNum, twoPoundsNum, poundsNum, fiftiesNum, twentiesNum, tensNum, fivesNum, twosNum, onesNum;

        System.out.print("Please enter the number of fifty pound notes available: ");
        fiftyPoundsNum = input.nextInt();

        System.out.print("Please enter the number of twenty pound notes available: ");
        twentyPoundsNum = input.nextInt();

        System.out.print("Please enter the number of ten pound notes available: ");
        tenPoundsNum = input.nextInt();

        System.out.print("Please enter the number of five pound notes available: ");
        fivePoundsNum = input.nextInt();

        System.out.print("Please enter the number of two pound coins available: ");
        twoPoundsNum= input.nextInt();

        System.out.print("Please enter the number of pound coins available: ");
        poundsNum = input.nextInt();

        System.out.print("Please enter the number of fifty pence coins available: ");
        fiftiesNum = input.nextInt();

        System.out.print("Please enter the number of twenty pence coins available: ");
        twentiesNum = input.nextInt();

        System.out.print("Please enter the number of ten pence coins available: ");
        tensNum = input.nextInt();

        System.out.print("Please enter the number of five pence coins available: ");
        fivesNum = input.nextInt();

        System.out.print("Please enter the number of two pence coins available: ");
        twosNum = input.nextInt();

        System.out.print("Please enter the number of one pence coins available: ");
        onesNum = input.nextInt();

        //***Change for A - ensure positive, non-zero integer is used for change***

        while(true)
        {
            //prompt for input
            System.out.print("How much change do you need enter in pence, please)? ");
            change = input.nextInt();

            //check change isn't zero
            if (change ==0)
            {
                System.out.println("Zero entered; Please enter a positive number");
            }
            //check change isn't negative
            else if (change < 0)
                System.out.println("Negative number entered; Please enter a positive number");
            else
                {
                System.out.println("OK, that's "+(change/100)+" pound(s) and "+(change%100)+" pence.");
                break;
                }
        }

        //***Changes for B - include additional currency for £2 to £50***
        //***Changes for C - ensure sufficient notes available for making change***

        //check fifty pound notes

        int fiftyPoundNotes = (int)change/5000;
        int notesToUse = (int)Math.min(fiftyPoundNotes, fiftyPoundsNum);
        change -= 5000 * notesToUse;
        fiftyPounds = notesToUse;

        //check twenty pound notes

        int twentyPoundNotes = (int)change/2000;
        notesToUse = (int)Math.min(twentyPoundNotes, twentyPoundsNum);
        change -= 2000 * notesToUse;
        twentyPounds = notesToUse;

        //check ten pound notes

        int tenPoundNotes = (int)change/1000;
        notesToUse = (int)Math.min(tenPoundNotes, tenPoundsNum);
        change -= 1000 * notesToUse;
        tenPounds = notesToUse;

        //check five pound notes

        int fivePoundNotes = (int)change/500;
        notesToUse = (int)Math.min(fivePoundNotes, fivePoundsNum);
        change -= 500 * notesToUse;
        fivePounds = notesToUse;

        //check two pound coins

        int twoPoundCoins = (int)change/200;
        notesToUse = (int)Math.min(twoPoundCoins, twoPoundsNum);
        change -= 200 * notesToUse;
        twoPounds = notesToUse;

        //check pound coins

        int poundCoins = (int)change/100;
        notesToUse = (int)Math.min(poundCoins, poundsNum);
        change -= 100 * notesToUse;
        pounds = notesToUse;

        //check 50p

        int fiftiesCoins = (int)change/50;
        notesToUse = (int)Math.min(fiftiesCoins, fiftiesNum);
        change -= 50 * notesToUse;
        fifties = notesToUse;

        //check 20p

        int twentiesCoins = (int)change/20;
        notesToUse = (int)Math.min(twentiesCoins, twentiesNum);
        change -= 20 * notesToUse;
        twenties = notesToUse;

        //check 10p

        int tensCoins = (int)change/10;
        notesToUse = (int)Math.min(tensCoins, tensNum);
        change -= 10 * notesToUse;
        tens = notesToUse;

        //check 5p

        int fivesCoins = (int)change/5;
        notesToUse = (int)Math.min(fivesCoins, fivesNum);
        change -= 5 * notesToUse;
        fives = notesToUse;

        //check 2p

        int twosCoins = (int)change/2;
        notesToUse = (int)Math.min(twosCoins, twosNum);
        change -= 2 * notesToUse;
        twos = notesToUse;

        //check 1p

        int onesCoins = (int)change;
        notesToUse = (int)Math.min(onesCoins, onesNum);
        change -= notesToUse;
        ones = notesToUse;

        // ***changes for B - include additional currency in output*** output results
        System.out.println(" ");
        System.out.println("Minimum coins needed is: ");
        System.out.println(fiftyPounds + " fifty pound note(s)");
        System.out.println(twentyPounds + " twenty pound note(s)");
        System.out.println(tenPounds + " ten pound note(s)");
        System.out.println(fivePounds + " five pound note(s)");
        System.out.println(twoPounds + " two pound coin(s)");
        System.out.println(pounds + " pound coin(s)");
        System.out.println(fifties + " fifty pence(s)");
        System.out.println(twenties + " twenty pence(s)");
        System.out.println(tens + " ten pence(s)");
        System.out.println(fives + " five pence(s)");
        System.out.println(twos + " two pence(s)");
        System.out.println(ones + " one pence(s)");
        System.out.println("----------------------------");
        System.out.println("Total number of coins is: "+(fiftyPounds+twentyPounds+tenPounds+fivePounds+twoPounds+pounds+fifties+twenties+tens+fives+twos+ones));
        System.out.println("----------------------------");
    }
}