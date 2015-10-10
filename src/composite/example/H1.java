package composite.example;

import composite.pattern.Leaf;

/**
 * Created by olsh0415 on 10/9/2015.
 */
public class H1 extends Leaf
{
    public H1(String text)
    {
        super("H1", text);
    }

    public H1()
    {
        super("H1");
    }
}
