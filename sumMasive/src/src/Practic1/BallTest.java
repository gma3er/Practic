package Practic1;

public class BallTest
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball("red", 23.11);
        Ball b2 = new Ball( 45.78);
        b2.setColour("blue");
        System.out.println(b1);
        System.out.println(b1.Diam());
        System.out.println(b2);
        System.out.println(b2.Diam());

    }
}