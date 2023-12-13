package Practic5;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColour());
        System.out.println(s1.getFilled());

        System.out.println();

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColour());
        System.out.println(c1.getFilled());
        System.out.println(c1.getRadius());


        System.out.println();

        Shape s3 = new Rectangle("RED", false, 1.0, 2.0);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColour());

        System.out.println();

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColour());
        System.out.println(r1.getLength());

        System.out.println();

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColour());


        System.out.println();


        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColour());
        System.out.println(r2.getLength());

        System.out.println();

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColour());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}
