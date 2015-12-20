package abstractFactory.products.menu;

/**
 * Created by olsh on 12/17/2015.
 */
public class ConcreteMacOSMenu implements AbstractMenu
{
    @Override
    public String printMenuType()
    {
        return "Mac OS Menu";
    }
}
