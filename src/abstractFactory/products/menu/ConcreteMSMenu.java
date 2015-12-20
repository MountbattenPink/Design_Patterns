package abstractFactory.products.menu;

/**
 * Created by olsh on 12/17/2015.
 */
public class ConcreteMSMenu implements AbstractMenu
{
    @Override
    public String printMenuType()
    {
        return "MS Menu";
    }
}
