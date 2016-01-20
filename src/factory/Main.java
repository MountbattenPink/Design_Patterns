package factory;

/**
 * Created by pc on 20.01.2016.
 */
public class Main {

    public static void main(String ... args){
        ToyFactory toyFactory=new ToyFactory();
        System.out.println(toyFactory.produceTank());
        System.out.println(toyFactory.produceHelicopter());
        System.out.println(toyFactory.produceConstructor());
    }
}
