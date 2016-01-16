package visitor.visitor;

import visitor.visitable.Alkane;
import visitor.visitable.Carbon;
import visitor.visitable.Oxygen;

/**
 * Created by pc on 15.01.2016.
 */
public class FormulaReader implements Visitor{
    public void visit(Alkane alkane){
  //      for ()
    }


    public void visit(Carbon carbon){
        System.out.print("H");
    }


    public void visit(Oxygen oxygen){
        System.out.print("-O-");
    }

}
