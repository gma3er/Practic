package Practic6;

public abstract class Dog
{
    protected String colour;
    protected String name;
    protected int weight;
    protected int height;

    public Dog(String colour, String name, int weight, int height)
    {
        this.colour = colour;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Dog ()
    {
        colour = "non";
        name = "non";
        weight = 0;
        height = 0;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public abstract boolean heightCheck();

    @Override
    public String toString()
    {
        return "CLASS DOG - " + '/'
                + " ,colour = " + colour + '/'
                + " ,name = " + name + '/'
                + " ,weight = " + weight + '/'
                + " ,height = " + height;
    }
}
