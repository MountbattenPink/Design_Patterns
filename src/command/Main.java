package command;

import command.command.*;
import command.request.*;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException
    {
        Invoker commandInvoker = new Invoker();
        commandInvoker.putCommand(new TurnOnCommand(TV.getInstance()));
        commandInvoker.putCommand(new VolumePlusCommand(TV.getInstance(), 5));
        commandInvoker.putCommand(new VolumeMinusCommand(TV.getInstance(), 3));
        commandInvoker.putCommand(new TurnOffCommand(TV.getInstance()));

        commandInvoker.invokeAll();


        commandInvoker.putCommand(new TurnOnCommand(Radio.getInstance()));
        commandInvoker.putCommand(new VolumePlusCommand(Radio.getInstance(), 5));
        commandInvoker.putCommand(new VolumeMinusCommand(Radio.getInstance(), 3));
        commandInvoker.putCommand(new TurnOffCommand(Radio.getInstance()));

        commandInvoker.invokeAll();


        commandInvoker.putCommand(new TurnOnCommand(Player.getInstance()));
        commandInvoker.putCommand(new VolumePlusCommand(Player.getInstance(), 5));
        commandInvoker.putCommand(new VolumeMinusCommand(Player.getInstance(), 3));
        commandInvoker.putCommand(new TurnOffCommand(Player.getInstance()));

        commandInvoker.invokeAll();

    }
}
