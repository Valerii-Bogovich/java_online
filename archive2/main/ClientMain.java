package by.epam.jonline.tasks.archive2.main;

import java.net.InetAddress;

import java.net.UnknownHostException;
import by.epam.jonline.tasks.archive2.logic.ClientLogic;

public class ClientMain {

	public static void main(String[] args) {
		try {
            InetAddress host = InetAddress.getByName("localhost");
            int port = Integer.parseInt("8080");

            
            
            ClientLogic clientLogic = new ClientLogic();
            clientLogic.start();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

	

}
