package filter.filters;

import filter.Tablet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by pc on 04.02.2016.
 */
public class OrFilter extends AbstractFilter {
    List<AbstractFilter> filters=new ArrayList<>();

    public OrFilter(List<AbstractFilter> filters) {
        this.filters = filters;
    }

    @Override
    public List<Tablet> meetCriteria(List<Tablet> tablets) {
        HashSet<Tablet>tabletHash=new HashSet<>();
        for (AbstractFilter filter:filters){
            tabletHash.addAll(filter.meetCriteria(tablets));
        }
        return new ArrayList<>(tabletHash);
    }
}
