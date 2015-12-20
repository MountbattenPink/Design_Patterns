package abstractFactory.factories;

import abstractFactory.products.button.AbstractButton;
import abstractFactory.products.menu.AbstractMenu;
import abstractFactory.products.window.AbstractWindow;

/**
 * Created by olsh on 12/17/2015.
 */
public interface AbstractWidgetFactory
{
    public AbstractWindow createWindow();
    public AbstractButton createButton();
    public AbstractMenu createMenu();
}
