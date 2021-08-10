package com.bluesoft.designepatterns.creational.factorymethod;

import com.bluesoft.designepatterns.creational.factorymethod.message.Message;

abstract class MessageCreator {
    public Message getMessage(){
        Message msq = createMessage();
        msq.addDefaultHeaders();
        msq.encrypt();
        return  msq;
    }

    public abstract Message createMessage();
}
