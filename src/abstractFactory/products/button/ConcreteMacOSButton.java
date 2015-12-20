package abstractFactory.products.button;

/**
 * Created by olsh on 12/17/2015.
 */
public class ConcreteMacOSButton implements AbstractButton
{
    @Override
    public String printButtonType()
    {
        return "Mac OS Button";
    }
}
