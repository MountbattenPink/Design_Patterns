package composite;

import composite.example.*;

/**
 * Created by olsh0415 on 10/9/2015.
 */
public class Main
{
    public static void main(String args[]){
        Html html = new Html();
        Head head = new Head();
        Title title = new Title("Composite Pattern");
        Body body = new Body();
        P p = new P("Example of Composite Structural Pattern");
        H1 h1 = new H1("By OL SH");

        html.addComponent(head);
        html.addComponent(body);
        head.addComponent(title);
        body.addComponent(p);
        body.addComponent(h1);

        html.Print(0);
    }
}
