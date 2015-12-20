package abstractFactory;

import abstractFactory.factories.AbstractWidgetFactory;
import abstractFactory.factories.ConcreteMSWidgetFactory;
import abstractFactory.factories.ConcreteMacOSWidgetFactory;

public class Main {

    public static void main(String[] args) {
	    GUIBuilder guiBuilder=new GUIBuilder();
        System.out.println("abstractWidgetFactory becomes concreteMSWidgetFactory");
        AbstractWidgetFactory abstractWidgetFactory=new ConcreteMSWidgetFactory();
        guiBuilder.buildElements(abstractWidgetFactory);
        System.out.println("abstractWidgetFactory becomes concreteMacOSWidgetFactory");
        abstractWidgetFactory=new ConcreteMacOSWidgetFactory();
        guiBuilder.buildElements(abstractWidgetFactory);
    }
}
