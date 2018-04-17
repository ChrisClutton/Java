import java.util.Scanner;

/* The Library Class */

class Library
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String bookTitle, bookAuthor;
        int pubDate;

        System.out.print ("Enter the title, author and date for the first book: ");
        bookTitle = input.nextLine();
        bookAuthor = input.nextLine();
        pubDate = input.nextInt();
        input.nextLine();

        Book book1 = new Book(bookTitle, bookAuthor, pubDate);

        System.out.print ("Enter the title, author and date for the second book: ");
        bookTitle = input.nextLine();
        bookAuthor = input.nextLine();
        pubDate = input.nextInt();
        input.nextLine();

        Book book2 = new Book(bookTitle, bookAuthor, pubDate);

        if (book1.getDate() > book2.getDate())
            System.out.print (book1.getTitle());
        else if (book2.getDate() > book1.getDate())
            System.out.print (book2.getTitle());
        else
            System.out.print ("Neither");

        System.out.print (" is the most recent book");

        if (book1.getAuthor().equals(book2.getAuthor()))
            System.out.println (" and books have the same author!");
        else
            System.out.println (" and books have different authors.");
    }
}
