package interpreter;

/**
 * Created by pc on 12.03.2016.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return (context.contains(data));
    }
}
