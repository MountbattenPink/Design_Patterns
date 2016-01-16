package visitor.visitor;

import visitor.visitable.Alkane;
import visitor.visitable.Carbon;
import visitor.visitable.Oxygen;

/**
 * Created by pc on 15.01.2016.
 */
public abstract class FormulaReader implements Visitor{
    public abstract void visit(Alkane alkane);
    public abstract void visit(Carbon carbon);
    public abstract void visit(Oxygen oxygen);

}
