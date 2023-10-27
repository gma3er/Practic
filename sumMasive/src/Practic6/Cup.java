package Practic6;

public class Cup extends Dish
{
    protected double height;
    protected double radius;

    public Cup (String material, String colour, double height, double radius)
    {
        super(material, colour);
        this.height = height;
        this.radius = radius;
    }

    public double getHeight()
    {
        return height;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getVolume()
    {
        return Math.PI * radius * height;
    }

    @Override
    public String toString()
    {
        return "CLASS CUP - " + '/'
                + "name = " + material + '/'
                + " ,colour = " + colour + '/'
                + " ,height = " + height + '/'
                + " ,radius = " + radius;
    }
}
