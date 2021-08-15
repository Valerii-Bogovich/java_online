package by.epam.jonline.tasks.archive2.entity;

import java.io.Serializable;


import by.epam.jonline.tasks.archive2.entity.MessageType;

public class Message implements Serializable {
    private final MessageType type;
    private final String data;

    public Message(MessageType type) {
        this.type = type;
        data = null;
    }

    public Message(MessageType type, String data) {
        this.type = type;
        this.data = data;
    }

    public MessageType getType() {
        return type;
    }

    public String getData() {
        return data;
    } 
    
}
