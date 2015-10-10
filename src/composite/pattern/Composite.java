package composite.pattern;


import java.util.*;

/**
 * Created by olsh0415 on 10/9/2015.
 */
public class Composite implements Component
{
    LinkedList<Component> components = new LinkedList<Component>();

    private final String name;

    public Composite(String name)
    {
        this.name = name;
    }

    public void addComponent(Component c){
        components.add(c);
    }

    public void removeComponent(Component c){
        components.remove(c);
    }

    @Override
    public void Print(int depth)
    {
        for (int i=0; i<depth;i++){
            System.out.printf("\t");
        }
        System.out.printf("<"+name+">\n");
        for (Component c:components){
            c.Print(depth+1);
        }
        for (int i=0; i<depth;i++){
            System.out.printf("\t");
        }
        System.out.printf("</"+name+">\n");

    }
}
