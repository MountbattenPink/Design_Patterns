package memento;

/**
 * Created by pc on 19.02.2016.
 */
//creates and saves object states in Memento object
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }
}
