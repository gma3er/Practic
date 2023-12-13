package Practic5;

public class Circle extends Shape
{
    protected double radius;

    public Circle()
    {
        super();
        radius = 0;
    }

    public Circle (double radius)
    {
        super();
        this.radius = radius;
    }

    public Circle (String colour, boolean filled, double radius)
    {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString()
    {
        return "CLASS CIRCLE - " + '/'
                + "colour = " + colour + '/'
                + " ,filled = " + filled +'/'
                + " ,radius = " + radius;
    }


}
