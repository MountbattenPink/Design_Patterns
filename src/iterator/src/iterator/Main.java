package iterator;

import iterator.chains.*;
import iterator.entity.*;
import iterator.iterator.Iterator;

public class Main {

    public static void main(String[] args) {
       Container mayhem = new BlackMetalBand();
        mayhem.addMember(new Musician("Necrobutcher", Role.bass));
        mayhem.addMember(new Musician("Hellhammer", Role.drum));
        mayhem.addMember(new Musician("Attila Csihar", Role.vocal));
        mayhem.addMember(new Musician("Ghul", Role.guitar));

        Container tyr = new VikingMetalBand();
        tyr.addMember(new Musician("Heri Joensen", Role.guitar));
        tyr.addMember(new Musician("Gunnar Thomsen", Role.bass));
        tyr.addMember(new Musician("Terji Skibenæs", Role.guitar));
        tyr.addMember(new Musician("Kári Streymoy", Role.drum));
        tyr.addMember(new Musician("Pól Arni Holm", Role.vocal));

        System.out.println("Mayhem:");
        Iterator mayhemIterator=mayhem.createItrator();
        while (mayhemIterator.hasNext())
            System.out.println(mayhemIterator.next());

        System.out.println("\n\nTýr:");
        Iterator tyrIterator=tyr.createItrator();
        while (tyrIterator.hasNext())
            System.out.println(tyrIterator.next());

    }
}
