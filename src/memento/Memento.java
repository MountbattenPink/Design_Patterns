package memento;

/**
 * Created by pc on 19.02.2016.
 */
//contains a state of object to be restored
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
