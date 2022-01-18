package structural.fly_weight;

import java.awt.*;

public class CustomRectangle {

    private Color color;

    public CustomRectangle(Color color) {

        this.color = color;
    }

    public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {

        g.setColor(color);
        g.fillRect(upperX, upperY, lowerX, lowerY);
    }
}
