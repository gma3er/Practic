package Practic3;
import java.lang.*;
public class Author
{
    private String name, email;
    private char gender;

    public Author (String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        if (gender != 'm' && gender != 'f' )
        {
            System.out.println("Ошибка");
            System.exit(0);


        }

        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public char getGender()
    {
        return gender;
    }

    public void setEmail()
    {
        this.email = email;
    }

    public String toString()
    {
        return name + " " + gender + " at " + email;
    }

}