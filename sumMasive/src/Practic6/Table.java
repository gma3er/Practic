package Practic6;

public class Table extends Furniture
{
    private String material;

    public Table(String name, int price, int height, int width, int length, String material)
    {
        super(name, price, height, width, length, material);
    }


    @Override
    public void canSleep()
    {
        System.out.println("You fall asleep on a chair and fall off it");
    }

    @Override
    public String toString()
    {
        return "CLASS TABLE - " + '/'
                + super.toString();
    }


}
