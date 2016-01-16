package iterator.chains;

import iterator.entity.Musician;
import iterator.iterator.Iterator;

import java.util.*;


public class VikingMetalBand implements Container
{
    private Map<String, Musician> band;


    public VikingMetalBand()
    {
        band = new HashMap<String, Musician>();
    }


    @Override
    public Iterator createItrator()
    {
        return new VikingMetalIterator();
    }


    @Override
    public void addMember(Object newMember)
    {
        band.put(((Musician)newMember).name.toString(), (Musician)newMember);
    }

    private class VikingMetalIterator implements Iterator
    {
        private int position;

        @Override
        public boolean hasNext()
        {
            return band.size() > position;
        }

        @Override
        public Object next()
        {
           return band.values().toArray()[position++];
        }
    }
}




