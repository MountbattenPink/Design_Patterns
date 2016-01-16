package iterator.chains;


import iterator.iterator.Iterator;

public interface Container
{
    Iterator createItrator();

    void addMember(Object o);
}
