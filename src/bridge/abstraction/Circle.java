package bridge.abstraction;

import bridge.implementor.DrawAPI;

/**
 * Created by pc on 09.01.2016.
 */
public class Circle extends Shape {
    private int x,y,radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
