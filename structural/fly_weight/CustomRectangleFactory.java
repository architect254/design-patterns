package structural.fly_weight;

import java.util.HashMap;
import java.awt.Color;

public class CustomRectangleFactory {
    private static final HashMap<Color, CustomRectangle> rectsByColor = new HashMap<>();

    public static CustomRectangle getRectangle(Color color) {
        CustomRectangle rect = (CustomRectangle) rectsByColor.get(color);

        if (rect == null) {
            rect = new CustomRectangle(color);
            rectsByColor.put(color, rect); 
        }

        return rect;
    }
}
