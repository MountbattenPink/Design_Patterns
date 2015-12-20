package abstractFactory.products.button;

/**
 * Created by olsh on 12/17/2015.
 */
public class ConcreteMSButton implements AbstractButton
{
    @Override
    public String printButtonType()
    {
        return "MS Button";
    }
}
