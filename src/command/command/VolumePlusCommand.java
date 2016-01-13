package command.command;


import command.request.ElectronicDevice;

public class VolumePlusCommand extends AbstractCommand
{
    ElectronicDevice device;
    int amount;

    public VolumePlusCommand(ElectronicDevice device, int amount)
    {
        this.device = device;
        this.amount = amount;
    }

    @Override
    public void execute()
    {
        for (int i=0;i<amount;i++)
        device.volumeUp();
    }
}
