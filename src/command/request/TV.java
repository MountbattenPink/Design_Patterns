package command.request;


public class TV extends ElectronicDevice
{
    private static TV instance;

    public synchronized static TV getInstance()
    {
        if (instance==null)
        {
            instance=new TV();
            instance.setType("TV");
        }

        return instance;
    }
}
