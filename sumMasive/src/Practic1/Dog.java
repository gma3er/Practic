package Practic1;

import java.lang.*;
public class Dog
{
    private int age;
    private String name;

    public Dog(String n, int a)
    {
        name = n;
        age = a;
    }

    public Dog(String n)
    {
        name = n;
        age = 0;
    }

    public Dog()
    {
        name = "Pup";
        age = 0;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String toString()
    {
        return "Dog`s name is " + name + '\'' +
                ", dog`s age is " + age;
    }

    public String HumanAge()
    {
        return name + "'s age in human is " + age*7;
    }
}
