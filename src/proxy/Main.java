package proxy;

/**
 * Created by pc on 14.02.2016.
 */
public class Main {

    public static void main(String ... args) {
        Image image = new ImageProxy("Image.JPG");
        System.out.println("Drawing first time");
        image.draw();
        System.out.println("Drawing next time");
        image.draw();
    }
}
