package Practic10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printDigits(number);
    }

    public static void printDigits(int number)
    {
        if (number > 9)
        {
            printDigits(number / 10);
        }
        System.out.print(number % 10 + " ");
    }
}