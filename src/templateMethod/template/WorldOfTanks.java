package templateMethod.template;

/**
 * Created by pc on 14.02.2016.
 */
public class WorldOfTanks extends Game {
    @Override
    void initialize() {
        System.out.println("This is World of Tanks!");
    }

    @Override
    void startPlay() {
        System.out.println("World of Tanks starts! Choose your tank!");
    }

    @Override
    void endPlay() {
        System.out.println("World of Tanks game over");
    }
}
