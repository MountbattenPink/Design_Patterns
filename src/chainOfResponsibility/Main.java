package chainOfResponsibility;

/**
 * Created by pc on 14.03.2016.
 */
public class Main {
    static AbstractLogger mainLogger = new ErrorLogger(AbstractLogger.ERROR);
    static AbstractLogger debugLogger = new FileLogger(AbstractLogger.DEBUG);
    static AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);

  static {
        mainLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);
    }

    public static void main(String[] args) {
        mainLogger.logMessage(AbstractLogger.INFO, "message for info");
        mainLogger.logMessage(AbstractLogger.DEBUG, "message for debug");
        mainLogger.logMessage(AbstractLogger.ERROR, "message for error");

    }
}
