package templateMethod;

import templateMethod.template.Game;
import templateMethod.template.WorldOfTanks;
import templateMethod.template.Wow;

/**
 * Created by pc on 14.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Wow();
        game.play();

        game = new WorldOfTanks();
        game.play();
    }
}
