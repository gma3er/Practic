package Practic6;

public class Table extends Furniture
{
    private String material;

    public Table(String material, String name, int price, int height, int width, int length)
    {
        super(name, price, height, width, length);
        this.material = material;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
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
                + " material = " + material + '/'
                + super.toString();
    }


}
