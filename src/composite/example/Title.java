package composite.example;

import composite.pattern.Leaf;

/**
 * Created by olsh0415 on 10/9/2015.
 */
public class Title extends Leaf
{
    public Title(String text)
    {
        super("Title", text);
    }
}
