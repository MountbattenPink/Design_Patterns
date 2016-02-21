package flyweight;

/**
 * Created by pc on 21.02.2016.
 */
public class Main {
    private static final String colors[]={"red", "yellow", "blue", "white", "pink", "black"};

    public static void main(String[] args) {
        for (int i=0; i<20;++i){
            Circle circle = (Circle)ShapeFactory.getCircle(colors[(int)(Math.random()*colors.length)]);
            circle.setR((int)(Math.random()*100));
            circle.setX((int) (Math.random() * 100));
            circle.setY((int) (Math.random() * 100));
            circle.draw();
        }
    }
}
