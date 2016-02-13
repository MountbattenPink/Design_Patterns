package facade;

import facade.subsystem.Circle;
import facade.subsystem.Line;
import facade.subsystem.Rectangular;
import facade.subsystem.Triangle;

/**
 * Created by pc on 13.02.2016.
 */
public class ShapeFacade{
    public void createLine(){
        Line line = new Line();
        line.draw();
    }

    public void createTriangle(){
        Triangle triangle = new Triangle();
        triangle.draw();
    }
    public void createCircle(){
        Circle circle = new Circle();
        circle.draw();
    }
    public void createRectangle(){
        Rectangular rectangular = new Rectangular();
        rectangular.draw();
    }
}
