package command.command;


import command.request.ElectronicDevice;

public class TurnOffCommand extends AbstractCommand
{
    ElectronicDevice device;

    public TurnOffCommand(ElectronicDevice device)
    {
        this.device = device;
    }

    @Override
    public void execute()
    {
        if (device.getState()==true)device.off();
        else System.out.print(device.getType() + " is already off!");
    }
}
