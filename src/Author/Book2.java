package Author;

import java.util.Scanner;

/* The Book class */

class Book
{
    private String title;
    private String author;
    private int date;

    Book (String title, String author, int date)
    {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    String getTitle()
    {
        return title;
    }

    String getAuthor()
    {
        return author;
    }

    int getDate()
    {
        return date;

    }
}

/* The Library Class */

class library
{
    static final int quit = 0;
    public static int getMenuOpt()
    {
     Scanner menuOpt = new Scanner (System.in);
     int option;

     System.out.println ("1. Add a book to the collection");
     System.out.println ("2. List all books by author");
     System.out.println ("3. List all books published in year");
     System.out.println (quit + ".Quit");

     option = menuOpt.nextInt ();
     return option;
    }

    public static int addBook (Book bks[], int bookTot)
    {
        Scanner input = new Scanner (System.in);
        String title;
        String aut;
        int yr;

        System.out.print ("Enter the book title ");
        title = input.nextLine();
        System.out.print ("Enter the Author ");
        aut = input.nextLine();
        System.out.print ("Enter the publication date ");
        yr = input.nextInt();

        bks[bookTot] = new Book (title, aut, yr);

        bookTot++;

        return bookTot;
    }
    public static void listByAuthor (Book bks[], int bookTot)
    {
        String name;
        Scanner input = new Scanner (System.in);

        System.out.print ("Enter author's name ");
        name = input.nextLine();

        for (int count = 0; count < bookTot; count++)
        {
            if ( bks[count].getAuthor().equals(name))
                System.out.println (bks[count].getTitle());
        }
    }
    public static void listByYear (Book bks[], int bookTot)
    {
        Scanner input = new Scanner (System.in);
        int year;

        System.out.print ("Enter year ");
        year = input.nextInt();
        for (int count = 0; count < bookTot; count++)
        {
            if (bks[count].getDate()==year)
                System.out.println( bks[count].getTitle());
        }
    }
    public static void main (String[] args)
    {
        Book books[] = new Book[100];
        int booksInLibrary = 0;
        int option;
        option = getMenuOpt();

        while (option !=quit)
        {
            if (option == 1)
                booksInLibrary = addBook(books, booksInLibrary);
            else if (option == 2)
                listByAuthor (books, booksInLibrary);
            else if (option == 3)
                listByYear (books, booksInLibrary);
            else System.out.println ("Invalid input - try again");

            option = getMenuOpt();
        }
    }
}