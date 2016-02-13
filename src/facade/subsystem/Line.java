package facade.subsystem;

/**
 * Created by pc on 13.02.2016.
 */
public class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line.draw" + ++id);
    }
}
