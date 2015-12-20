package abstractFactory.factories;

import abstractFactory.products.button.AbstractButton;
import abstractFactory.products.button.ConcreteMSButton;
import abstractFactory.products.menu.*;
import abstractFactory.products.window.AbstractWindow;
import abstractFactory.products.window.ConcreteMSWindow;

/**
 * Created by olsh on 12/17/2015.
 */
public class ConcreteMSWidgetFactory implements AbstractWidgetFactory
{
    @Override
    public AbstractWindow createWindow()
    {
        AbstractWindow window = new ConcreteMSWindow();
        System.out.println("creation of "+window.printWindowType());
        return window;
    }

    @Override
    public AbstractButton createButton()
    {
        AbstractButton button = new ConcreteMSButton();
        System.out.println("creation of "+button.printButtonType());
        return button;
    }

    @Override
    public AbstractMenu createMenu()
    {
        AbstractMenu menu = new ConcreteMSMenu();
        System.out.println("creation of "+menu.printMenuType());
        return menu;
    }
}
