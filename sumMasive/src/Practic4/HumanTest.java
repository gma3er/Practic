package Practic4;

public class HumanTest
{
    public static void main(String[] args)
    {
        Human h1 = new Human(12, "Ivan");
        h1.setAge(20);
        h1.getInfo();

        System.out.println(" ");
        System.out.println("Head: ");
        Human.Head h2 = h1.new Head();
        h2.setSleep(true);
        h2.sleepInfo();
        h2.thinking();

        System.out.println(" ");
        System.out.println("Hand: ");
        Human.Hand h3 = h1.new Hand();
        h3.setMove(true);
        h3.move();

        System.out.println(" ");
        System.out.println("Leg: ");
        Human.Leg h4 = h1.new Leg();
        h3.setMove(false);
        h3.move();
    }
}
