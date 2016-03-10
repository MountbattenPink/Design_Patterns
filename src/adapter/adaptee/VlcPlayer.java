package adapter.adaptee;

import adapter.adaptee.AdvancedMediaPlayer;

/**
 * Created by pc on 10.03.2016.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
