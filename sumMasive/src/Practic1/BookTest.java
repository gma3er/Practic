package Practic1;
import java.lang.*;
public class BookTest
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Crime and Punishment", 672);
        Book b2 = new Book("Kolobok", 10);
        System.out.println(b1);
        System.out.println(b1.weekBook());
        System.out.println(b2);
        System.out.println(b2.weekBook());

    }
}