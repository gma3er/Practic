package Practic13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OutFile
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }

            bufferedReader.close();
        }
        catch (IOException e)
        {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}