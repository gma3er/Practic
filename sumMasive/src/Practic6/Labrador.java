package Practic6;

public class Labrador extends Dog
{
    public Labrador(String colour, String name, int weight, int height)
    {
        super(colour, name, weight, height);
    }

    public Labrador()
    {
        super();
    }

    public String isPlaying()
    {
        return name + " is playing";
    }

    public String isSleeping()
    {
        return name + "is sleeping";
    }

    @Override
    public boolean heightCheck()
    {
        return height < 70;
    }

    @Override
    public String toString ()
    {
        return "CLASS LABRADOR - " + '/'
                + "colour = " + colour + '/'
                + " ,name = " + name + '/'
                + " ,weight = " + weight + '/'
                + " ,height = " + height + '/';
    }
}
