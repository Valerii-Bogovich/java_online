package by.epam.jonline.tasks.archive2.logic;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


import by.epam.jonline.tasks.archive2.entity.Connection;
import by.epam.jonline.tasks.archive2.entity.Message;
import by.epam.jonline.tasks.archive2.entity.MessageType;

import by.epam.jonline.tasks.archive2.view.View;


public class ServerLogic implements Runnable {
	
	private static Map<String, Connection> connectionMap = new HashMap<String, Connection>();

	
	@Override
    public void run() {
		ServerSocket serverSocket = null;
        try {
          
            serverSocket = new ServerSocket(8080);

            
            while(true) {
                System.out.println("Waiting connection on port 8080" );
                //Момент ухода в ожидание подключения
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected to server");
                View.writeMessage("Установленно соединение с адресом " + clientSocket.getRemoteSocketAddress());
                Connection connection = new Connection(clientSocket);
                String userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                View.writeMessage("connect close");
                
                
                
				} 
                
                
            
        
           

        } catch (IOException e) {
        	try {
				serverSocket.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
    
	}
	
	private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

        connection.send(new Message(MessageType.NAME_REQUEST));
        Message messageResponse = connection.receive();

        while (!messageResponse.getType().equals(MessageType.USER_NAME) ||
                messageResponse.getData().equals("") ||
                connectionMap.containsKey(messageResponse.getData())) {
            connection.send(new Message(MessageType.NAME_REQUEST));
            messageResponse = connection.receive();


        }
        connectionMap.put(messageResponse.getData(), connection);
        connection.send(new Message(MessageType.NAME_ACCEPTED));
        return messageResponse.getData();
    }
	
	 public static void sendBroadcastMessage(Message message) {
	        for (Connection connection : connectionMap.values()) {
	            try {
	                connection.send(message);
	            } catch (IOException e) {
	                e.printStackTrace();
	                View.writeMessage("Сообщение не отправлено");
	            }
	        }
	    }
	 
	 private void sendListOfUsers(Connection connection, String userName) throws IOException {


       connectionMap.forEach((string, connect) -> {
           Message message = new Message(MessageType.USER_ADDED, string);
           if (!string.equals(userName)) {

               try {
                   connection.send(message);
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       });

       }
	 
	 private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
	        while (true) {
	            Message message = connection.receive();
	            if (message.getType() == MessageType.TEXT) {
	                sendBroadcastMessage((new Message(MessageType.TEXT, userName + ": " + message.getData())));
	            }else
	                View.writeMessage("Error");
	        }
	    }
	
}
