package filter;

import filter.filters.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pc on 04.02.2016.
 */
public class Main {
    public static void main(String ... args) {
        List<Tablet> tablets = new ArrayList<>();
        tablets.add(new Tablet(true,"intel core i3", 4, "geforce gtx"));
        tablets.add(new Tablet(true,"intel pentium", 2, "geforce gtx"));
        tablets.add(new Tablet(true,"AMD FX-8320", 6, "AMD FirePro™ V7900"));
        tablets.add(new Tablet(true,"AMD Athlon X4", 4, "NVIDIA NVS 315"));
        tablets.add(new Tablet(true,"intel core i7", 4, "GT 740"));
        tablets.add(new Tablet(true,"intel core i5", 6, "PowerColor Devil 13 Dual Core R9"));
        tablets.add(new Tablet(true,"intel Celeron", 6, "N/A"));
        tablets.add(new Tablet(true, "AMD Athlon X4", 2, "geforce gtx"));
        tablets.add(new Tablet(true, "AMD FX-9370", 2, "geforce gtx"));

        System.out.println("\nBy processor:" + new ProcessorFilter().meetCriteria(tablets));
        System.out.println("\nBy video adapter:" + new VideoAdapterFilter().meetCriteria(tablets));
        System.out.println("\nBy RAM:" + new RamFilter().meetCriteria(tablets));
        System.out.println("\nBy 3G:" + new Filter3G().meetCriteria(tablets));

        System.out.println("\nBy 3G and RAM and Processor:" + new AndFilter(Arrays.asList(new AbstractFilter[]{new Filter3G(),new RamFilter(),new ProcessorFilter()})).meetCriteria(tablets));
        System.out.println("\nBy 3G or RAM or Processor:" + new OrFilter(Arrays.asList(new AbstractFilter[]{new Filter3G(),new RamFilter(),new ProcessorFilter()})).meetCriteria(tablets));

    }
}
