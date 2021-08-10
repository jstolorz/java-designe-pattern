package com.bluesoft.designepatterns.creational.factorymethod;

import com.bluesoft.designepatterns.creational.factorymethod.message.JSONMessage;
import com.bluesoft.designepatterns.creational.factorymethod.message.Message;

class JSONMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
