package iterator.chains;

import iterator.entity.Musician;
import iterator.iterator.*;

import java.util.ArrayList;


public class BlackMetalBand implements Container
{
    private ArrayList<Musician> band;


    public BlackMetalBand()
    {
        band = new ArrayList<Musician>();
    }


    @Override
    public Iterator createItrator()
    {
        return new BlackMetalIterator();
    }


    @Override
    public void addMember(Object newMember)
    {
        band.add((Musician)newMember);
    }

    private class BlackMetalIterator implements Iterator
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
            return band.get(position++);
        }
    }
}




