package Practic8;

import javax.swing.*;
import java.awt.*;

public class Program extends JFrame {
    public static class Circle extends Shape {
        private int radius;

        public Circle(Color colour, Point pos, int radius) {
            super(colour, pos);
            this.radius = radius;
        }

        @Override
        public void draw(Graphics g) {
            g.setColor(colour);
            g.fillOval(position.x, position.y, radius * 2, radius * 2);
        }
    }

    public static class Rectangle extends Shape {
        private int height, width;

        public Rectangle(Color colour, Point position, int height, int width) {
            super(colour, position);
            this.height = height;
            this.width = width;
        }

        @Override
        public void draw(Graphics g) {
            g.setColor(colour);
            g.fillRect(position.x, position.y, width, height);
        }
    }

    public static class Main {
        public static Point getRandPos() {
            int x = (int) (Math.random() * 400);
            int y = (int) (Math.random() * 400);
            return new Point(x, y);
        }

        public static Color getRandCol() {
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);
            return new Color(r, g, b);
        }

        private static Shape getRandShape() {
            Color colour = getRandCol();
            Point position = getRandPos();

            if (Math.random() < 0.5) {
                int radius = (int) (Math.random() * 50) + 10;
                return new Circle(colour, position, radius);
            } else {
                int width = (int) (Math.random() * 100) + 20;
                int height = (int) (Math.random() * 100) + 20;
                return new Rectangle(colour, position, height, width);
            }
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Figures");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);

            JPanel panel = new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    for (int i = 0; i < 20; i++) {
                        Shape shape = getRandShape();
                        shape.draw(g);
                    }
                }
            };
            frame.add(panel);
            frame.setVisible(true);
        }
    }
}
