package strategy;

/**
 * Created by pc on 15.11.2015.
 */
public class ConcreteStrategyMod extends AbstractStrategy {
    @Override
    public int doOperation(int a, int b) {
        System.out.println("Operation: a mod b");
        return a%b;
    }
}
