package by.epam.jonline.programming_with_classes.agregation_and_composition.task4;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String name;
    private List<Client> clients;

    Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
    }

   
    public List<Client> getClients() {
		return clients;
	}


    public void setClients(List<Client> clients) {
		this.clients = clients;
	}


    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Банк под названием %s имеет %d клиентов", name, clients.size());
    }
}
