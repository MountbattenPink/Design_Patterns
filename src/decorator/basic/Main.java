package decorator.basic;

import decorator.concreteDecorator.*;

/**
 * Created by olsh on 12/8/2015.
 */
public class Main
{
    public static void main(String [] args){
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new SimplePizza()));
        System.out.println("Basic pizza ingredients: " + basicPizza.getDescription()+"\nCost:"+ basicPizza.getCost());

        Pizza meatPizza = new Beacon(new Chicken(basicPizza));
        System.out.println("Meat pizza ingredients: " + meatPizza.getDescription() + "\nCost:" + meatPizza.getCost());

        Pizza sourSweetPizza = new Pineapple(new Chicken(basicPizza));
        System.out.println("Sour-sweet pizza ingredients: " + sourSweetPizza.getDescription()+"\nCost:"+ sourSweetPizza.getCost());

        Pizza fruttiDelMare = new Mussel(basicPizza);
        System.out.println("Frutti del mare pizza ingredients: " + fruttiDelMare.getDescription()+"\nCost:"+ fruttiDelMare.getCost());
    }
}
