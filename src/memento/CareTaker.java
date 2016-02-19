package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 19.02.2016.
 */
//restores object state from Memento
public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento){
        mementos.add(memento);
    }
    public Memento get(int i){
        return  mementos.get(i);
    }

    public int last(){
        return mementos.size()-1;
    }
}
