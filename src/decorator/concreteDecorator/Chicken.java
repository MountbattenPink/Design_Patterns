package decorator.concreteDecorator;

import decorator.basic.*;

/**
 * Created by olsh on 12/8/2015.
 */
public class Chicken extends ToppingDecorator
{
    public Chicken(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Adding Chicken");
    }

    @Override
    public String getDescription()
    {
        return tempPizza.getDescription()+", Chicken";
    }

    @Override
    public double getCost()
    {
        return  tempPizza.getCost()+4.0;
    }
}
