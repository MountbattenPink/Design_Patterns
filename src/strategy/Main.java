package strategy;

/**
 * Created by pc on 15.11.2015.
 */
public class Main {
    public static void main(String args[]){
        Context context=new Context(new ConcreteStrategyAdd());
        int resultStrategyAdd=context.executeStrategy(23,4);

        context=new Context(new ConcreteStrategyMinus());
        resultStrategyAdd=context.executeStrategy(23,4);


        context=new Context(new ConcreteStrategyDiv());
        resultStrategyAdd=context.executeStrategy(23,4);


        context=new Context(new ConcreteStrategyMod());
        resultStrategyAdd=context.executeStrategy(23,4);


        context=new Context(new ConcreteStrategyMultiply());
        resultStrategyAdd=context.executeStrategy(23,4);


        context=new Context(new ConcreteStrategyPower());
        resultStrategyAdd=context.executeStrategy(23,4);
        }
}
