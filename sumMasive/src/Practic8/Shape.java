package Practic8;

import java.awt.*;


public abstract class Shape
{
    protected Color colour;
    protected Point position;

    public Shape(Color colour, Point position)
    {
        this.colour = colour;
        this.position = position;
    }

    abstract public void draw(Graphics g);
}
