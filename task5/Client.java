package by.epam.jonline.programming_with_classes.agregation_and_composition.task5;

public class Client {
	private String firstName;
    private String lastName;
    private TourPackage tourPackage;

    Client(String firstName, String lastName, double prepay) {
        this.firstName = firstName;
        this.lastName = lastName;
        
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
