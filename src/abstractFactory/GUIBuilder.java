package abstractFactory;

import abstractFactory.factories.AbstractWidgetFactory;

/**
 * Created by olsh on 12/17/2015.
 */
public class GUIBuilder
{
    public void buildElements(AbstractWidgetFactory abstractWidgetFactory)
    {
        abstractWidgetFactory.createWindow();
        abstractWidgetFactory.createButton();
        abstractWidgetFactory.createMenu();
    }
}
