package chainOfResponsibility;

/**
 * Created by pc on 14.03.2016.
 */
public class FileLogger extends AbstractLogger{
    @Override
    protected void logMessage(String message) {
        System.out.println("DEBUG: " + message);
    }

    public FileLogger(int level) {
        this.level = level;
    }
}
