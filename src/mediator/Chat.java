package mediator;

import java.util.Date;

/**
 * Created by pc on 14.02.2016.
 */
public class Chat {
    public static void showMessage(User user, String message){
        System.out.println(new Date() + ", " + user.getNick() + ": " + message);
    }
}
