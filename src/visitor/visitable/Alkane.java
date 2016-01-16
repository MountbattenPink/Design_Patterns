package visitor.visitable;

import visitor.visitor.FormulaReader;

import java.util.ArrayList;

/**
 * Created by pc on 15.01.2016.
 */
public class Alkane extends AbstractChemical {
    ArrayList<AbstractChemical> elements;

    public Alkane(int oxygenK){
        elements=new ArrayList<>();
        for (;oxygenK>0;)
        {
            elements.add(new Carbon());
            elements.add(new Carbon());
            elements.add(new Oxygen());
            elements.add(new Carbon());
            oxygenK-=1;
        }
        elements.add(new Carbon());
    }

    @Override
    public void accept(FormulaReader visitor) {
        for (AbstractChemical element:elements){
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
