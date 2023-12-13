package Practic5;

public class Square extends Rectangle
{
    public Square()
    {
        super();
    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String colour, boolean filled)
    {
        super(colour, filled, side, side);
    }

    public double getSide()
    {
        return width;
    }

    public void setSide(double side)
    {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side)
    {
        super.setWidth(width);
    }

    @Override
    public void setLength(double side)
    {
        super.setLength(length);
    }

    @Override
    public String toString()
    {
        return "CLASS SQUARE: " + '/'
                + "width = " + width + '/'
                + "length = " + length + '/'
                + "colour = " + colour + '/'
                + "filled = " + filled + '/';
    }
}
