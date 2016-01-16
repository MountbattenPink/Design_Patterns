package visitor.visitable;

import visitor.visitor.FormulaReader;

/**
 * Created by pc on 15.01.2016.
 */
public abstract class AbstractChemical implements Visitable {
    public abstract void accept(FormulaReader visitor);
}
