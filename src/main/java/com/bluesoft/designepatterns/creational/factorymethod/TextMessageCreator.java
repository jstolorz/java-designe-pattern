package com.bluesoft.designepatterns.creational.factorymethod;

import com.bluesoft.designepatterns.creational.factorymethod.message.Message;
import com.bluesoft.designepatterns.creational.factorymethod.message.TextMessage;

class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
