package chainOfResponsibility;

/**
 * Created by pc on 14.03.2016.
 */
public class ErrorLogger extends AbstractLogger{
    @Override
    protected void logMessage(String message) {
        System.out.println("ERROR: " + message);
    }

    public ErrorLogger(int level) {
        this.level = level;
    }
}
