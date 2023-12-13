package Practic8;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;


public class Sharingan extends JFrame
{
    private JLabel imgLabel;
    private int imgNum = 1;

    private Sharingan()
    {
        this.setSize(1000, 1000);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.jpg")), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(700, e -> nextImg());
        timer.start();
    }
    private void nextImg()
    {
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".jpg")));
        if (imgNum == 5)
        {
            imgNum = 0;
        }

    }

    public static void main(String[] args)
    {
        Sharingan mf = new Sharingan();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}