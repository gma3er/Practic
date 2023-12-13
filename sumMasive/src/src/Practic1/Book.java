package Practic1;

import java.lang.*;
public class Book
{
    private String title;
    private int page;

    public Book(String t, int p)
    {
        title = t;
        page = p;
    }

    public Book(String t)
    {
        title = t;
        page = 0;
    }

    public Book(int p)
    {
        title = "non";
        page = p;
    }

    public String getTitle()
    {
        return title;
    }

    public double getPage()
    {
        return page;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setPage(int page)
    {
        this.page = page;
    }

    public String toString()
    {
        return "Book`s title is " + title + '\'' +
                " and it`s number of pages is " + page;
    }

    public String weekBook()
    {
        return "You will finish this book in a week if you read" + '\''
                + page / 7 + " pages a day";
    }



}
