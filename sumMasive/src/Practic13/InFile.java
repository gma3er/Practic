package Practic13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InFile
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите информацию для записи в файл:");
        String input = scanner.nextLine();

        try
        {
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write(input);
            fileWriter.close();
            System.out.println("Информация успешно записана в файл.");
        }
        catch (IOException e)
        {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}