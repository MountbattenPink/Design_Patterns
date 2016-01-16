package iterator.entity;


public class Musician
{
    public String name;
    public Role role;

    public Musician(String name, Role role)
    {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString()
    {
        return  name  +" (" + role +")";
    }
}
