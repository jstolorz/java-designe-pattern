package com.bluesoft.designepatterns.creational.factorymethod;

import com.bluesoft.designepatterns.creational.factorymethod.message.Message;

class Client {
    public static void main(String[] args) {
        MessageCreator creator = new JSONMessageCreator();
        Message msq = creator.getMessage();
        System.out.println(msq);

        creator = new TextMessageCreator();
        msq = creator.getMessage();

        System.out.println(msq);
    }
}
