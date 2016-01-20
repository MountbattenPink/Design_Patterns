package factory.product;

/**
 * Created by pc on 20.01.2016.
 */
public class Toy {
    public String name = "";
    public int price = 0;

    @Override
    public String toString() {
        return  name  +
                " (price: " + price +
                ')';
    }
}
