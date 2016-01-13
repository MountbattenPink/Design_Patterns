package command.request;


public class Radio extends ElectronicDevice
{
    private static Radio instance;

    public synchronized static Radio getInstance()
    {
        if (instance==null)
        {
            instance=new Radio();
            instance.setType("Radio");
        }

        return instance;
    }
}
