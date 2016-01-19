package builder;

import builder.product.*;

/**
 * Created by pc on 16.01.2016.
 */
public class Main {
    public static void main(String ... args){
        Animal penguin = new AnimalBuilder()
              // .foot(new Paddle())
                .habitat(new Water())
                .head(new DefaultHead())
                .tail(new DefaultTail())
                .build();
        Animal hen = new AnimalBuilder()
                .foot(new Paw())
                .head(new BeakedHead())
                .habitat(new Land())
                .build();
        System.out.println("Penguin: " + penguin);
        System.out.println("Hen:" + hen);
    }
}
