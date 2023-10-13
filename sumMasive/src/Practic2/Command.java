package Practic2;

public class Command
{
    public static void main (String[] arg)
    {
        for (int i = 0; i < arg.length; i++)
        {
            System.out.println("Аргумент" + (i + 1) + ":" + arg[i]);
        }
    }
}
