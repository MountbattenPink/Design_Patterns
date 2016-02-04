package filter.filters;

import filter.Tablet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 04.02.2016.
 */
public class Filter3G extends AbstractFilter {
    @Override
    public List<Tablet> meetCriteria(List<Tablet> tablets) {
        List<Tablet>tabs=new ArrayList<>();
        for (Tablet t:tablets)
            if (t.isPresent3g())
                tabs.add(t);
        return tabs;
    }
}
