package strategy;

/**
 * Created by pc on 15.11.2015.
 */
public class ConcreteStrategyDiv extends AbstractStrategy {
    @Override
    public int doOperation(int a, int b) {
        System.out.println("Operation: a div b");
        return a/b;
    }
}
