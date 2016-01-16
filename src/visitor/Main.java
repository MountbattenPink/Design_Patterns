package visitor;

import visitor.visitable.Alkane;
import visitor.visitor.FormulaReader;

/**
 * Created by pc on 15.01.2016.
 */
public class Main {
    public static void main(String[]args) {
        Alkane propane = new Alkane(3);
        propane.accept(new FormulaReader());
    }
}
