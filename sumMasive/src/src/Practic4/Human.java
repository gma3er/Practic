package Practic4;
import java.util.Scanner;

public class Human
{
    private int age;
    private String name;
    Scanner sc = new Scanner(System.in);

    public Human(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public void getInfo()
    {
        System.out.println("Human`s name: " + name + ", Human`s age: " + age);
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public class Head
    {
        private boolean sleep = false;

        public void sleepInfo()
        {
            if (sleep) System.out.println("Human is sleeping");
            else System.out.println("Human isn`t sleep");
        }

        public void thinking()
        {
            if (sleep) System.out.println("Human sleep, not thinking");
            else System.out.println("Human thinking");
        }

        public void setSleep(boolean sleep)
        {
            this.sleep = sleep;
        }
    }

    public class Hand
    {
        private boolean m;

        public void setMove(boolean m)
        {
            this.m = m;
        }

        public void move()
        {
            if (m) System.out.println("Human`s hand is move");
            else System.out.println("Human`s hand isn`t move");
        }

        public boolean getMove()
        {
            return m;
        }
    }


    public class Leg
    {
        private boolean l;

        public void setMove(boolean l)
        {
            this.l = l;
        }

        public void move()
        {
            if (l) System.out.println("Human`s leg is move");
            else System.out.println("Human`s leg isn`t move");
        }

        public boolean getMove()
        {
            return l;
        }
    }
}

