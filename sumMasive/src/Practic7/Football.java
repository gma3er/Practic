package Practic7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Football extends JFrame implements ActionListener
{
    private int milanScore = 0;
    private int madridScore = 0;

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public Football()
    {

        setTitle("Football Scoreboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание кнопки "AC Milan"
        JButton milanButton = new JButton("AC Milan");
        milanButton.addActionListener(this);

        // Создание кнопки "Real Madrid"
        JButton madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(this);

        // Создание надписи "Result"
        resultLabel = new JLabel("Result: " + milanScore + " X " + madridScore);

        // Создание надписи "Last Scorer"
        lastScorerLabel = new JLabel("Last Scorer: N/A");

        // Создание надписи "Winner"
        winnerLabel = new JLabel("Winner: DRAW");

        // Размещение компонентов на панели содержимого
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);
        add(panel);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        if (event.getActionCommand().equals("AC Milan"))
        {
            milanScore++;
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else if (event.getActionCommand().equals("Real Madrid"))
        {
            madridScore++;
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore)
        {
            winnerLabel.setText("Winner: AC Milan");
        }
        else if (milanScore < madridScore)
        {
            winnerLabel.setText("Winner: Real Madrid");
        }
        else
        {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Football();

            }
        });
    }
}
