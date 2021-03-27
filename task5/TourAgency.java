package by.epam.jonline.programming_with_classes.agregation_and_composition.task5;

import java.util.ArrayList;
import java.util.List;

public class TourAgency {
	private String nameOfTourAgency;
    private List<TourPackage> tourPackages;
    private List<Client> clients;

    TourAgency(String nameOfTourAgency) {
        this.nameOfTourAgency = nameOfTourAgency;
        tourPackages = new ArrayList<TourPackage>();
        clients = new ArrayList<Client>();
    }

	public String getNameOfTourAgency() {
		return nameOfTourAgency;
	}

	public void setNameOfTourAgency(String nameOfTourAgency) {
		this.nameOfTourAgency = nameOfTourAgency;
	}

	public List<TourPackage> getTourPackages() {
		return tourPackages;
	}

	public void setTourPackages(List<TourPackage> tourPackages) {
		this.tourPackages = tourPackages;
	}
	
	 void addTourPackage (TourPackage tourPackage) {
	        tourPackages.add(tourPackage);
	    }

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	void addClient(Client client) {
	        clients.add(client);
	}
    
    

}
