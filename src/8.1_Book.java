/* The Book class */

class Book
{
    private String title;
    private String author;
    private int date;

    Book (String t, String a, int d)
    {
        title = t;
        author = a;
        date = d;
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