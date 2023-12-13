package Practic6;

public class DogTest
{
    public static void main(String[] args)
    {
        System.out.println();

        Dog d1 = new Labrador("white", "Jack", 50, 56);
        System.out.println(d1);
        System.out.println(d1.getColour());
        System.out.println(d1.getName());
        System.out.println(d1.getWeight());
        System.out.println(d1.getHeight());

        System.out.println();

        Labrador l1 = (Labrador) d1;
        System.out.println(l1.isPlaying());
        System.out.println(l1.isSleeping());
        System.out.println(l1.heightCheck());

        System.out.println();

        Dog d2 = new Beagle("brown", "Axile", 35, 35);
        System.out.println(d2);
        System.out.println(d2.getColour());
        System.out.println(d2.getName());
        System.out.println(d2.getWeight());
        System.out.println(d2.getHeight());

        System.out.println();

        Beagle b1 = (Beagle) d2;
        System.out.println(b1.isHunting());
        System.out.println(b1.isSleep());
        System.out.println(b1.heightCheck());
    }
}
