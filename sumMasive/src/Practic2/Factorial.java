package Practic2;
import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите получить");
        int x = sc.nextInt(), r = 1;
        for (int i = 1; i <= x; i++)
        {
            r = r * i;
        }
        System.out.println("Факториал числа " + x);
        System.out.println(r);
    }
}
