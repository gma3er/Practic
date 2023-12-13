package Practic8;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Picture
{
    public Picture(String imagePath)
    {
        // Создание окна
        JFrame frame = new JFrame("Отображение картинки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Загрузка картинки
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(imageIcon);

        // Добавление картинки на окно
        frame.getContentPane().add(label);

        // Установка размеров окна по размерам картинки
        frame.pack();

        // Отображение окна
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        if (args.length > 0)
        {
            String imagePath = args[0];
            Picture exemple = new Picture(imagePath);
        }
        else
        {
            System.out.println("Путь к картинке не указан");
        }
    }
}