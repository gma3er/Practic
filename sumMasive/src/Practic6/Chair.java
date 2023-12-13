package Practic6;

public class Chair extends Furniture
{
    private boolean back;

    public Chair(boolean back, String name, int price, int height, int width, int length, String material)
    {
        super(name, price, height, width, length, material);
        this.back = back;
    }

    public boolean getBack()
    {
        return back;
    }

    public void setBack(boolean back)
    {
        this.back = back;
    }

    @Override
    public void canSleep()
    {
        System.out.println("You fell asleep on the table, you're weird");
    }

    @Override
    public String toString()
    {
        return "CLASS CHAIR - " + '/'
                + " back = " + back + '/'
                + super.toString();
    }
}
