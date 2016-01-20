package factory;

import factory.product.Constructor;
import factory.product.Helicopter;
import factory.product.Tank;
import factory.product.Toy;

/**
 * Created by pc on 20.01.2016.
 */
public class ToyFactory {
    public Toy produceConstructor(){
        return new Constructor();
    }
    public Toy produceHelicopter(){
        return new Helicopter();
    }
    public Toy produceTank(){
        return new Tank();
    }


}
