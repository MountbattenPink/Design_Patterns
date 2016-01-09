package bridge.abstraction;

import bridge.implementor.DrawAPI;

/**
 * Created by pc on 09.01.2016.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
