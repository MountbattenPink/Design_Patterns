package decorator.basic;


/**
 * Created by olsh on 12/8/2015.
 */
public class SimplePizza implements Pizza
{

    @Override
    public String getDescription()
    {
        return "Dough";
    }

    @Override
    public double getCost()
    {
        return 10.0;
    }
}
