package Practic6;

public class DishTest
{
    public static void main(String[] args)
    {
        System.out.println();

        Dish d1 = new Cup("clay", "white", 11, 22);
        System.out.println(d1);
        System.out.println(d1.getName());
        System.out.println(d1.getColour());
        System.out.println(d1.getVolume());

        System.out.println();

        Cup c1 = (Cup)d1;
        System.out.println(c1);
        System.out.println(c1.getName());
        System.out.println(c1.getColour());
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
        System.out.println(c1.getVolume());

        System.out.println();

        Dish d2 = new Plate("plastic", "yellow", 0.5, 10);
        System.out.println(d2);
        System.out.println(d2.getName());
        System.out.println(d2.getColour());
        System.out.println(d2.getVolume());

        System.out.println();

        Plate p1 = (Plate)d2;
        System.out.println(p1);
        System.out.println(p1.getName());
        System.out.println(p1.getColour());
        System.out.println(p1.getHeight());
        System.out.println(p1.getDiameter());
        System.out.println(p1.getVolume());


    }
}
