package strategy;

/**
 * Created by pc on 15.11.2015.
 */
public class Context {
    private AbstractStrategy strategy;

    public Context(AbstractStrategy strategy) {
        this.strategy = strategy;
    }
    public int executeStrategy(int a, int b){
        return strategy.doOperation(a, b);
    }
}
