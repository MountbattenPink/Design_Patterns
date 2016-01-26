package prototype;

import prototype.button.ActionButton;
import prototype.button.Button;

/**
 * Created by pc on 26.01.2016.
 */
public class Main {
public static void main(String ... args){

    Button actionButton = new ActionButton();
    actionButton.setId("1");
    actionButton.setText("first Button");
    actionButton.setPositionX(1);
    actionButton.setPositionY(2);

    System.out.print(actionButton.clone());
}
}
