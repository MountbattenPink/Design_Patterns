package memento;

/**
 * Created by pc on 19.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("1v");
        originator.setState("2v");
        originator.setState("3v");
        originator.setState("4v");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("5v");
        originator.setState("6v");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("7v");
        System.out.println("Current state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("1st saved state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(careTaker.last()));
        System.out.println("las saved state: " + originator.getState());
    }
}
