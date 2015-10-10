package composite.pattern;

/**
 * Created by olsh0415 on 10/9/2015.
 */
public class Leaf implements Component
{
    private final String name;
    private String text;

    public Leaf(String name, String text)
    {
        this.name = name;
        this.text = text;
    }

    public Leaf(String name)
    {
        this.name = name;
    }

    @Override
    public void Print(int depth)
    {
        for (int i=0; i<depth;i++){
            System.out.printf("\t");
        }
        System.out.printf("<"+name+">"+text+"</"+name+">\n");
    }

}
