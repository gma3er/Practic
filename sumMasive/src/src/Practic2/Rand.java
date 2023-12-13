package Practic2;
import java.util.Arrays;

public class Rand
{
    public static void main(String[] args)
    {
        int[] ar1 = new int[10];
        System.out.println("Неотсортированный массив: ");
        for(int i = 0; i <  ar1.length; i++)
        {
            ar1[i] = (int)(Math.random() * 100);
            System.out.print(ar1[i] + "  ");
        }

        System.out.println(" ");
        System.out.println("Отсортированный массив: ");

        Arrays.sort(ar1);
        System.out.println(Arrays.toString(ar1));
    }
}
