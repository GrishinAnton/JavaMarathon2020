package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1, u2, text));
    }
    public static List<Message> getMessages(){
        return  messages;
    }

    public static boolean isSender(Message message, User user){
        return message.getSender().getUsername().equals(user.getUsername());
    }

    public static boolean isReceiver(Message message, User user){
        return message.getReceiver().getUsername().equals(user.getUsername());
    }

    public static void showDialog(User u1, User u2){
        for (Message message: messages){

            if(isSender(message, u1) && isReceiver(message, u2)){
                System.out.println(u1.getUsername()+": "+message.getText());
            }
            if(isSender(message, u2) && isReceiver(message, u1)){
                System.out.println(u2.getUsername()+": "+message.getText());
            }
        }
    }
}
