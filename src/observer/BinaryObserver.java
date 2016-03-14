package observer;

/**
 * Created by pc on 14.03.2016.
 */
public class BinaryObserver extends Observer {
    @Override
    public void update() {
        System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
    }

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
}
