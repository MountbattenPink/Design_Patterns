package strategy;

/**
 * Created by pc on 15.11.2015.
 */
public class ConcreteStrategyPower extends AbstractStrategy {
    @Override
    public int doOperation(int a, int b) {
        System.out.println("Operation: Pow(a,  b)");
        return (int)Math.pow(a, b);
    }
}
