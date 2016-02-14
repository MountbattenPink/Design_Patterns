package templateMethod.template;

/**
 * Created by pc on 14.02.2016.
 */
public class Wow extends Game {

    @Override
    void initialize() {
        System.out.println("This is WoW!");
    }

    @Override
    void startPlay() {
        System.out.println("WoW starts!");
    }

    @Override
    void endPlay() {
        System.out.println("WoW game over...");
    }
}
