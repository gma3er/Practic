package Practic6;

public class Plate extends Dish
{
    protected double height;
    protected double diameter;

    public Plate(String material, String colour, double height, double diameter)
    {
        super(material, colour);
        this.height = height;
        this.diameter = diameter;
    }

    public double getHeight()
    {
        return height;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setDiameter(double diameter)
    {
        this.diameter = diameter;
    }

    @Override
    public double getVolume()
    {
        return  Math.PI * height * ((diameter * diameter) / 4);
    }

    @Override
    public String toString()
    {
        return "CLASS PLATE - " + '/'
                + "name = " + material + '/'
                + " ,colour = " + colour + '/'
                + " ,height = " + height + '/'
                + " ,diameter = " + diameter;
    }
}
