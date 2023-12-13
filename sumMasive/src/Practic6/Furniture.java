package Practic6;

public abstract class Furniture
{
    private String name;
    private int price;
    private int height;
    private int width;
    private int length;
    private String material;

    public Furniture(String name, int price, int height, int width, int length, String material)
    {
        this.name = name;

        if (price <= 0) throw new IllegalArgumentException ("The price cannot be less than 0");
        this.price = price;

        if (height <= 0) throw new IllegalArgumentException("The height cannot be less than 0");
        this.height = height;

        if (width <= 0) throw new IllegalArgumentException("The width cannot be less then 0");
        this.width = width;

        if (length <= 0) throw new IllegalArgumentException("The length cannot be less then 0");
        this.length = length;

        this.material = material;
    }

    public abstract void canSleep();

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice (int price)
    {
        if (price <= 0) throw new IllegalArgumentException ("The price cannot be less than 0");
        this.price = price;
    }

    public void setHeight(int height)
    {
        if (height <= 0) throw new IllegalArgumentException("The height cannot be less than 0");
        this.height = height;
    }

    public void setWidth(int width)
    {
        if (width <= 0) throw new IllegalArgumentException("The width cannot be less then 0");
        this.width = width;
    }

    public void setLength(int length)
    {
        if (length <= 0) throw new IllegalArgumentException("The length cannot be less then 0");
        this.length = length;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getLength()
    {
        return length;
    }

    public String getMaterial()
    {
        return material;
    }

    @Override
    public String toString()
    {
        return "CLASS FURNITURE - " + " /"
                + " name = " + name + " /"
                + " price = " + price + " /"
                + " height = " + height + " /"
                + " width = " + width + " /"
                + " length = " + length + " /"
                + " material = " + material;
    }




}
