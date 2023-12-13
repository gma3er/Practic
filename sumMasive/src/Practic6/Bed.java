package Practic6;

public class Bed extends Furniture
{
    private int numSleepP;

    public Bed (int numSleepP, String name, int price, int height, int weight, int length, String material)
    {
        super(name, price, height, weight, length, material);
        this.numSleepP = numSleepP;
    }

    public int getNumSleepP()
    {
        return numSleepP;
    }

    public void setNumSleepP(int numSleepP)
    {
        this.numSleepP = numSleepP;
    }

    @Override
    public void canSleep()
    {
        System.out.println("You fell asleep on the bed, good night");
    }

    @Override
    public String toString()
    {
        return "CALL BED - " + '/'
                + " number of beds " + numSleepP + '/'
                + super.toString();
    }
}
