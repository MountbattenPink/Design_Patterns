package facade;

/**
 * Created by pc on 14.02.2016.
 */
public class Main {
    public static void main(String ... args){
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.createCircle();
        shapeFacade.createLine();
        shapeFacade.createRectangle();
        shapeFacade.createTriangle();
    }
}
