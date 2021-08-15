package by.epam.jonline.tasks.archive2.entity;

import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;

import by.epam.jonline.tasks.archive2.entity.Message;

public class Connection {
	private final Socket socket;
    private final ObjectOutputStream out;
    private final ObjectInputStream in;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
    }

    public void send(Message message) throws IOException{
        
            out.writeObject(message);
        
    }

    public Message receive() throws IOException, ClassNotFoundException{
        
            return (Message) in.readObject();
        
    }

    public SocketAddress getRemoteSocketAddress(){
        return socket.getRemoteSocketAddress();
    }

   
    public void close() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
