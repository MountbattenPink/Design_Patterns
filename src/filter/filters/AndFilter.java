package filter.filters;

import filter.Tablet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 04.02.2016.
 */
public class AndFilter extends AbstractFilter{
    List<AbstractFilter> filters=new ArrayList<>();

    public AndFilter(List<AbstractFilter> filters) {
        this.filters = filters;
    }

    @Override
    public List<Tablet> meetCriteria(List<Tablet> tablets) {
        for (AbstractFilter filter:filters){
            tablets=filter.meetCriteria(tablets);
        }
        return tablets;
    }
}
