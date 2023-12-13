package Practic6;

public class Beagle extends Dog
{
    public Beagle(String colour, String name, int weight, int height)
    {
        super(colour, name, weight, height);
    }

    public Beagle()
    {
        super();
    }

    public String isHunting()
    {
        return name + " is hunting";
    }

    public String isSleep()
    {
        return name + " is sleeping";
    }

    @Override
    public boolean heightCheck()
    {
        return height < 45;
    }

    @Override
    public String toString()
    {
        return "CLASS BEAGLE - " + '/'
                + "colour = " + colour + '/'
                + " ,name = " + name + '/'
                + " ,weight = " + weight + '/'
                + " ,height = " + height + '/';
    }
}
