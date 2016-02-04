package filter.filters;

import filter.Tablet;

import java.util.List;

/**
 * Created by pc on 04.02.2016.
 */
public abstract class AbstractFilter {
   public abstract List<Tablet> meetCriteria(List<Tablet> tablets);
}
