package state.model;

import state.model.State;

public class Context
{
    private State state;

    public State getState()
    {
        return state;
    }

    public void setState(State state)
    {
        this.state = state;
    }
}
