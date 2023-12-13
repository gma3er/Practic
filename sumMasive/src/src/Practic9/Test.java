package Practic9;

public class Test
{
    public static void main(String[] args)
    {
        Console sony = new Console ("PlayStation 5");
        Planet mars = new Planet("Mars");
        MusicBrand marshall = new MusicBrand("Marshall");

        String name1 = sony.getName();
        String name2 = mars.getName();
        String name3 = marshall.getName();

        System.out.println("Console name is " + name1);
        System.out.println("Planet name is " + name2);
        System.out.println("Music brand name is " + name3);
    }
}
