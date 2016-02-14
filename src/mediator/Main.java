package mediator;

/**
 * Created by pc on 14.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        User dart = new User("Dart");
        User chebi = new User("Chebi");
        dart.sendMessage("I'm your father");
        chebi.sendMessage("Oh no!!");
    }
}
