package decorator.concreteDecorator;


import decorator.basic.Pizza;
import decorator.basic.ToppingDecorator;

/**
 * Created by olsh on 12/8/2015.
 */
public class Beacon extends ToppingDecorator
{
    public Beacon(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Adding Beacon");
    }

    @Override
    public String getDescription()
    {
        return tempPizza.getDescription()+", Beacon";
    }

    @Override
    public double getCost()
    {
        return  tempPizza.getCost()+3.0;
    }

}

