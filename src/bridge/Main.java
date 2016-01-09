package bridge;

import bridge.abstraction.Circle;
import bridge.abstraction.Shape;
import bridge.implementor.DrawRedCircleAPI;
import bridge.implementor.GreenCircle;

/**
 * Created by pc on 09.01.2016.
 */
public class Main {
    public static void main(String[] args){
        Shape redCircle = new Circle(new DrawRedCircleAPI(),100,100,10);
        Shape greenCircle = new Circle(new GreenCircle(),100,100,10);
    }
}
