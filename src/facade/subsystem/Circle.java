package facade.subsystem;

/**
 * Created by pc on 14.02.2016.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw" + ++id);
    }
}
