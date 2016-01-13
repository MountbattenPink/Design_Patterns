package command.request;



public abstract class ElectronicDevice
{
    private String type;
    private int volume;
    private boolean state;

    public boolean getState()
    {
        return state;
    }

    public String getType()
    {
        return type;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void on(){
        state = !state;
        System.out.print(type + " now is on.");
    }

    public  void off(){
        state = !state;
        System.out.print(type + " now is off.");
    }

    public void volumeUp(){
        System.out.print(type + "'s volume level was increased. Now "+ ++volume);
    }

    public void volumeOff(){
        System.out.print(type + "'s volume level was decreased. Now "+ --volume);
    }

}
