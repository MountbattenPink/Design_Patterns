package visitor.visitable;

import visitor.visitor.FormulaReader;

/**
 * Created by pc on 15.01.2016.
 */
public class Carbon extends AbstractChemical {
    @Override
    public void accept(FormulaReader visitor) {
        visitor.visit(this);
    }
}
