package chainOfResponsibility;

/**
 * Created by pc on 14.03.2016.
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if (this.level<=level){
           logMessage(message);
        }
        if (nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }

    abstract protected void logMessage(String message);
}
