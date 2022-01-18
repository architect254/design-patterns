package structural.fly_weight;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class FlyWeightTest extends JFrame {
    JButton startDrawing;

    int windowWidth = 1750;
    int windowHeight = 150;

    Color[] shapeColors = { Color.orange, Color.red, Color.yellow, Color.blue, Color.pink, Color.cyan, Color.magenta,
            Color.black, Color.gray };

    public FlyWeightTest() {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Fly Weight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {

                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i = 0; i < 1000000; ++i) {
                    CustomRectangle rect = CustomRectangleFactory.getRectangle(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
                }

                long endTime = System.currentTimeMillis();

                System.out.println("That took " + (endTime - startTime));

            }

        });

        this.add(contentPane);
        this.setVisible(true);
    }

    private Color getRandColor() {

        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt((shapeColors.length));
        return shapeColors[randInt];

    }

    private int getRandX() {
        return (int) (Math.random() * windowWidth);
    }

    private int getRandY() {
        return (int) (Math.random() * windowHeight);
    }


}
