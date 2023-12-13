package Practic9;

public class Test2
{
    public static void main(String[] args)
    {
        Headphones headphones = new Headphones("7000");
        MusicAlbum album = new MusicAlbum("1000");
        Phone phone = new Phone ("50000");

        String name1 = headphones.getPrice();
        String name2 = album.getPrice();
        String name3 = phone.getPrice();

        System.out.println("Headphone`s price is " + name1 + "р.");
        System.out.println("Album`s price is " + name2 + "р.");
        System.out.println("Phone`s price is " + name3+ "р.");
    }
}
