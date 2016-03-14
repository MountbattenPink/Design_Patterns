package chainOfResponsibility;

/**
 * Created by pc on 14.03.2016.
 */
public class ConsoleLogger extends AbstractLogger{
    @Override
    protected void logMessage(String message) {
        System.out.println("INFO: " + message);
    }

    public ConsoleLogger(int level) {
        this.level = level;
    }
}
