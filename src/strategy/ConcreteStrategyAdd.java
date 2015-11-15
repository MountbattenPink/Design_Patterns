package strategy;

/**
 * Created by pc on 15.11.2015.
 */
public class ConcreteStrategyAdd extends AbstractStrategy {
    @Override
    public int doOperation(int a, int b) {
        System.out.println("Operation: a + b");
        return a+b;
    }
}
