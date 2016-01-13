package command.request;


public class Player extends ElectronicDevice
{
    private static Player instance;

    public synchronized static Player getInstance()
    {
        if (instance==null)
        {
            instance=new Player();
            instance.setType("Player");
        }

        return instance;
    }
}
