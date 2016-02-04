package filter.filters;

import filter.Tablet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 04.02.2016.
 */
public class VideoAdapterFilter extends AbstractFilter {
    @Override
    public List<Tablet> meetCriteria(List<Tablet> tablets) {
        List<Tablet>tabs=new ArrayList<>();
        for (Tablet t:tablets)
            if (t.getVideoAdepterModel().matches("(.*)geforce(.*)"))
                tabs.add(t);
        return tabs;
    }
}
