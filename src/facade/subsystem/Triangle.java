package facade.subsystem;

/**
 * Created by pc on 14.02.2016.
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw" + ++id);
    }
}
