package state.model;

public class StopState implements State
{
    @Override
    public void doAction(Context context)
    {
        context.setState(this);
        System.out.println("Stopped");
    }

    @Override
    public String toString()
    {
        return "Stop State";
    }
}
