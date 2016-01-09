package bridge.implementor;

/**
 * Created by pc on 09.01.2016.
 */
public class DrawRedCircleAPI implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.print("Drawing RED circle with radius="+radius+",\nx="+x+"\ny="+y);
    }
}
