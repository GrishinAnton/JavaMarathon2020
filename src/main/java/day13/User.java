package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }
    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user){
        boolean result = false;
        for (User u: user.subscriptions){
            if(u.username.equals(this.username)){
                result = true;
            }
        }
        return result;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(new User(this.username), user, text);
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
