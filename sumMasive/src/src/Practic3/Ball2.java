package Practic3;

public class Ball2
{
    private double x = 0.0;
    private double y = 0.0;

    public Ball2(double x, double y )
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double  x)
    {
        this.x = x;

    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setXY(double x, double y)
    {
        setX(x);
        setY(y);
    }

    public void move(double xDisp, double yDisp)
    {
        setX(x + xDisp);
        setY(y + yDisp);
    }

    public String toString()
    {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}