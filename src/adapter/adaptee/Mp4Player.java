package adapter.adaptee;

import adapter.adaptee.AdvancedMediaPlayer;

/**
 * Created by pc on 10.03.2016.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file " + fileName);
    }
}
