package state.model;


public class StartState implements State
{
    @Override
    public void doAction(Context context)
    {
        context.setState(this);
        System.out.println("Started");
    }

    @Override
    public String toString()
    {
        return "Start State";
    }
}
