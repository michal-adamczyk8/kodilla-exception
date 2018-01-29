package com.kodilla.exception.nullpointer;

public class NullPointExceptionRunner {
    public static void main(String[] args){
        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "bla bla bla");
        } catch (MessageNotSentException e){
            System.out.println("Message was not sent but my program is still running well.");
        }

        System.out.println("Processing other logic.");
    }
}
