package by.epam.jonline.tasks.archive2.logic;

import java.io.IOException;



import java.net.Socket;

import by.epam.jonline.tasks.archive2.entity.Connection;
import by.epam.jonline.tasks.archive2.logic.InputLogic;
import by.epam.jonline.tasks.archive2.view.View;
import by.epam.jonline.tasks.archive2.entity.Message;
import by.epam.jonline.tasks.archive2.entity.MessageType;



public class ClientLogic {
	
	private  Connection connection;
    private  boolean clientConnected = false;
	
    public void start() {
       
        try (Socket socket = new Socket("localhost", 8080)) {
        	connection = new Connection(socket);
        	clientHandshake();
        }   
              catch (IOException e) {
                notifyConnectionStatusChanged(false);
            } catch (ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);
            }
        	if (clientConnected) {
	            InputLogic.writeMessage("Соединение установлено. Для выхода наберите команду 'exit'.");
	        } else
	            InputLogic.writeMessage("Произошла ошибка во время работы клиента.");
            
        	
           

           

       
    }
    
    protected String getUserName() {
        InputLogic.writeMessage("Введите имя пользователя: ");
        return InputLogic.readString();
    }
    
    public void clientHandshake() throws IOException, ClassNotFoundException {
        Message message;
        while (true) {
            message = connection.receive();
            if (message.getType() == MessageType.NAME_REQUEST) {
                connection.send(new Message(MessageType.USER_NAME, getUserName()));
            } else if (message.getType() == MessageType.NAME_ACCEPTED) {
                notifyConnectionStatusChanged(true);
                return;
            } else {
                throw new IOException("Unexpected MessageType");
            }
        }
    }
    
    public void clientMainLoop() throws IOException, ClassNotFoundException {
        Message message;
        while (true) {
        	message = connection.receive();
            if (message.getType() == MessageType.TEXT) {
                View.writeMessage(message.getData());
            } else if (message.getType() == MessageType.USER_ADDED) {
                View.informAboutAddingNewUser(message.getData());

            } else if (message.getType() == MessageType.USER_REMOVED) {
                View.informAboutDeletingNewUser(message.getData());

            } else
                throw new IOException("Unexpected MessageType");
        }

    }
    
    public void notifyConnectionStatusChanged(boolean clientConnected) {
        clientConnected = clientConnected;
        
    }

   


}
