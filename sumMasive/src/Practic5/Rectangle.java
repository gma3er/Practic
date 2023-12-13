package Practic5;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    Rectangle()
    {
        super();
        width = 0;
        length = 0;
    }

    Rectangle(double width, double length)
    {
        super();
        this.width = width;
        this.length = length;
    }

    Rectangle (String colour, boolean filled, double width, double length)
    {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return width * length;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (width + length);
    }

    @Override
    public String toString()
    {
        return "CLASS RECTANGLE - " + '/'
                + "colour = " + colour + '/'
                + " ,filled = " + filled + '/'
                + " ,width = " + width + '/'
                + " ,length = " + length;
    }
}
