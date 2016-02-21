package flyweight;

import java.util.HashMap;

/**
 * Created by pc on 21.02.2016.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);
        if (circle==null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating " + color + " circle");
        }
        return circle;
    }
}
