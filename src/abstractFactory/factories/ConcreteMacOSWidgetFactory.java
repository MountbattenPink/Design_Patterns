package abstractFactory.factories;

import abstractFactory.products.button.AbstractButton;
import abstractFactory.products.button.ConcreteMacOSButton;
import abstractFactory.products.menu.*;
import abstractFactory.products.window.AbstractWindow;
import abstractFactory.products.window.ConcreteMacOSWindow;

/**
 * Created by olsh on 12/17/2015.
 */
public class ConcreteMacOSWidgetFactory implements AbstractWidgetFactory
{
    @Override
    public AbstractWindow createWindow()
    {
        AbstractWindow window = new ConcreteMacOSWindow();
        System.out.println("creation of "+window.printWindowType());
        return window;
    }

    @Override
    public AbstractButton createButton()
    {
        AbstractButton button = new ConcreteMacOSButton();
        System.out.println("creation of "+button.printButtonType());
        return button;
    }

    @Override
    public AbstractMenu createMenu()
    {
        AbstractMenu menu = new ConcreteMacOSMenu();
        System.out.println("creation of "+menu.printMenuType());
        return menu;
    }
}
