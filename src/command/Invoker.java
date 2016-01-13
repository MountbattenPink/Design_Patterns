package command;


import command.command.AbstractCommand;

import java.util.*;

public class Invoker
{
    private List<AbstractCommand> commands = new ArrayList<AbstractCommand>();

    public void putCommand(AbstractCommand command){
        commands.add(command);
    }

    public void invokeAll(){
        for (AbstractCommand command:commands){
            command.execute();
        }
        commands.clear();
    }

}
