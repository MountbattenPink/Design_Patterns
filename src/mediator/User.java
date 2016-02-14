package mediator;

/**
 * Created by pc on 14.02.2016.
 */
public class User {
    private String nick;

    public User(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void sendMessage(String message){
        Chat.showMessage(this, message);
    }
}
