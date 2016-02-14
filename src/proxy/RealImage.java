package proxy;

/**
 * Created by pc on 14.02.2016.
 */
public class RealImage implements Image {
    private String name;

    @Override
    public void draw() {
        System.out.println(name + "Drawn");
    }

    public RealImage(String name) {
        this.name = name;
        loadImage(name);
    }

    public void loadImage(String fileName){
        System.out.println("Loading" + fileName);
    }
}
