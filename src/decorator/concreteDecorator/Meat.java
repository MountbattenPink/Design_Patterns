package decorator.concreteDecorator;

import decorator.basic.Pizza;
import decorator.basic.ToppingDecorator;

/**
 * Created by olsh on 12/8/2015.
 */
public class Meat extends ToppingDecorator
{
    public Meat(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Adding Meat");
    }

    @Override
    public String getDescription()
    {
        return tempPizza.getDescription()+", Meat";
    }

    @Override
    public double getCost()
    {
        return  tempPizza.getCost()+3.0;
    }

}

