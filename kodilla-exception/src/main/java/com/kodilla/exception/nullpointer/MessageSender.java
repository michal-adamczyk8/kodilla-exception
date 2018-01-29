package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessageTo(User user, String text) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sending message: " + text + "to: " + user.getName());
        }
        throw new MessageNotSentException("Object user was null!");
    }
}
