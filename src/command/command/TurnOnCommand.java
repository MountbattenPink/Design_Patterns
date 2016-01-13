package command.command;


import command.request.ElectronicDevice;

public class TurnOnCommand extends AbstractCommand
{
    ElectronicDevice device;

    public TurnOnCommand(ElectronicDevice device)
    {
        this.device = device;
    }

    @Override
    public void execute()
    {
        if (device.getState()==false)device.on();
        else System.out.print(device.getType() + " is already on!");
    }
}
