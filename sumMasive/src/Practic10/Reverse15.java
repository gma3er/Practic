package Practic10;
import java.util.Scanner;
public class Reverse15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printDigitsReversed(number);
    }

    public static void printDigitsReversed(int number)
    {
        if (number < 10)
        {
            System.out.print(number);
        }
        else
        {
            System.out.println(number % 10);
            printDigitsReversed(number / 10);
        }
    }
}
