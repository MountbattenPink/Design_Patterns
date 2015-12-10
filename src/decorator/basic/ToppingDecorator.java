package decorator.basic;

/**
 * Created by olsh on 12/8/2015.
 */
public abstract class ToppingDecorator implements Pizza
{
    protected Pizza tempPizza;

    public  ToppingDecorator(Pizza newPizza)
    {
        tempPizza=newPizza;
    }

    @Override
    public String getDescription()
    {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost()
    {
        return  tempPizza.getCost();
    }
}
