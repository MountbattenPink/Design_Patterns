package decorator.concreteDecorator;

import decorator.basic.*;

/**
 * Created by olsh on 12/8/2015.
 */
public class TomatoSauce extends ToppingDecorator
{
    public TomatoSauce(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Adding Tomato Sauce");
    }

    @Override
    public String getDescription()
    {
        return tempPizza.getDescription()+", Tomato Sauce";
    }

    @Override
    public double getCost()
    {
        return  tempPizza.getCost()+1.0;
    }

}

