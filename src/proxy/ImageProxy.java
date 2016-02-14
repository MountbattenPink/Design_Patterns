package proxy;

/**
 * Created by pc on 14.02.2016.
 */
public class ImageProxy implements Image {
    private RealImage realImage;
    private String imageName;

    @Override
    public void draw() {
    if (realImage==null) {
        realImage = new RealImage(imageName);
    }
        realImage.draw();
    }

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }
}
