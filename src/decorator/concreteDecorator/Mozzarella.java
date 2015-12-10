package decorator.concreteDecorator;

import decorator.basic.*;

/**
 * Created by olsh on 12/8/2015.
 */
public class Mozzarella extends ToppingDecorator
{
    public Mozzarella(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Adding mozzarella");
    }

    @Override
    public String getDescription()
    {
        return tempPizza.getDescription()+", Mozzarella";
    }

    @Override
    public double getCost()
    {
        return  tempPizza.getCost()+2.0;
    }

}

