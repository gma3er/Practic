package Practic2;

public class Massive
{
    public static void main (String[] arg)
    {
        int y = 0;
        int[] x = new int [10];
        for( int i = 0; i < 10; i++)
        {
            x[i] = i;
        }

        System.out.println("Сумма с for: ");
        for (int i = 0; i < 10; i++)
        {
            y = y + x[i];
        }
        System.out.println(y);
        y = 0;

        System.out.println("Сумма с while: ");
        int i = 0;
        while(i != 10)
        {
            y = y + x[i];
            i++;
        }
        System.out.println(y);
        y = 0;
        i = 0;


        System.out.println("Сумма с do while: ");
        do
        {
            y = y + x[i];
            i++;
        } while (i != 10);
        System.out.println(y);
    }
}
