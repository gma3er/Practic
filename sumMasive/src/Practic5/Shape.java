package Practic5;

public abstract class Shape
{
    protected String colour;
    protected boolean filled;

    public Shape (String colour, boolean filled)
    {
        this.colour = colour;
        this.filled = filled;
    }

    public Shape()
    {
        colour = "non";
        filled = false;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour (String colour)
    {
        this.colour = colour;
    }

    public boolean getFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString()
    {
        return "CLASS SHAPE - " + '/'
        + "colour =  " + colour + '/'
        + ", filled = " + filled;
    }

}
