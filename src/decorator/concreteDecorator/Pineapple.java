package decorator.concreteDecorator;

import decorator.basic.*;

/**
 * Created by olsh on 12/8/2015.
 */
public class Pineapple extends ToppingDecorator
{
    public Pineapple(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Adding Pineapple");
    }

    @Override
    public String getDescription()
    {
        return tempPizza.getDescription() + ", Pineapple";
    }

    @Override
    public double getCost()
    {
        return tempPizza.getCost() + 6.0;
    }
}

