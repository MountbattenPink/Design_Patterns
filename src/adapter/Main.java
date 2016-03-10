package adapter;

/**
 * Created by pc on 10.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "fileName.mp3");
        audioPlayer.play("mp4", "fileName.mp4");
        audioPlayer.play("vlc", "fileName.vlc");
        audioPlayer.play("avi", "fileName.avi");
    }
}

