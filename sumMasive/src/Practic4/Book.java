package Practic4;
import java.util.Scanner;

public class Book
{
    private String name;
    private String author;
    private int year;
    Scanner sc = new Scanner(System.in);

    public Book (String n, String a, int y)
    {
        name = n;
        author = a;
        year = y;
    }

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getYear()
    {
        return year;
    }

    public String setName ()
    {
        System.out.println("Enter name: ");
        name = sc.nextLine();
        return name;
    }

    public String setAuthor ()
    {
        System.out.println("Enter author: ");
        author = sc.nextLine();
        return author;
    }

    public int setYear()
    {
        System.out.println("Enter year: ");
        year = sc.nextInt();
        return year;
    }

    public String toString()
    {
        return "Book`s name is " + name + ", Book`s author is " + author + ", Book`s year of publication is " + year;
    }
}