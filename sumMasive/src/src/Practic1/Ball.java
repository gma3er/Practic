package Practic1;
import java.lang.*;

public class Ball
{
    private String colour;
    private double radius;

    public Ball(String c, double r)
    {
        colour = c;
        radius = r;
    }

    public Ball(String c)
    {
        colour = c;
        radius = 0;
    }

    public Ball(double r)
    {
        colour = "non";
        radius = r;
    }

    public String getColour()
    {
        return colour;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public void setRadius(double amount)
    {
        this.radius = amount;
    }

    public String toString()
    {
        return "Balls`s colour is " + colour + '\'' +
                " and it`s radius is " + radius;
    }
    public String Diam()
    {
        return "Ball`s radius is " + radius*2;
    }

}