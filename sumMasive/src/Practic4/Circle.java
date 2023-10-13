package Practic4;
import java.util.Scanner;
import java.lang.Math;
public class Circle
{
    private int rad;
    private int dim;
    private double sq;

    Scanner sc = new Scanner(System.in);

    public Circle (int rad, int dim)
    {
        this.rad = rad;
        this.dim = dim;
    }

    public void setRad()
    {
        System.out.println("Введите радиус окружности: ");
        rad = sc.nextInt();
    }

    public void setDim()
    {
        this.dim = rad * 2;
    }

    public int getRad(int rad)
    {
        System.out.println("Введите диаметр окружности: ");
        return rad;
    }

    public int getDim(int dim)
    {
        return dim;
    }

    public double getSquare()
    {
        sq = Math.PI * Math.pow(rad, 2);
        return sq;
    }

    public String toString()
    {
        return "Радиус окружности = " + rad + ", Диаметр окружности = " + dim + '\''
                + ", Площадь окружности = " + sq;
    }
}
