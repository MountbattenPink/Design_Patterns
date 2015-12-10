package decorator.concreteDecorator;

import decorator.basic.*;

/**
 * Created by olsh on 12/8/2015.
 */
public class Mussel extends ToppingDecorator
{
    public Mussel(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Adding Mussels");
    }

    @Override
    public String getDescription()
    {
        return tempPizza.getDescription()+", Mussels";
    }

    @Override
    public double getCost()
    {
        return  tempPizza.getCost()+7.0;
    }
}
