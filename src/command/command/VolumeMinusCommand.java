package command.command;


import command.request.ElectronicDevice;

public class VolumeMinusCommand extends AbstractCommand
{
    ElectronicDevice device;
    int amount;

    public VolumeMinusCommand(ElectronicDevice device, int amount)
    {
        this.device = device;
        this.amount = amount;
    }

    @Override
    public void execute()
    {
        if (device.getVolume()>=amount)
        for (int i=0;i<amount;i++)
            device.volumeOff();
    }
}
