package by.epam.jonline.programming_with_classes.agregation_and_composition.task4;

import java.util.ArrayList;
import java.util.List;

public class Client {
	 private String firstName;
	 private String lastName;
	 private String passportID;
	 private List<Account> accounts;

	 Client(String firstName, String lastName, String passportID) {
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.passportID = passportID;
	      accounts = new ArrayList<Account>();
	 }

	 public List<Account> getAccounts() {
		return accounts;
	 }



	 public void setAccounts(List<Account> accounts) {
			this.accounts = accounts;
	 }

		public String getPassportID() {
	        return passportID;
	    }

	    public void setPassportID(String passportID) {
	        this.passportID = passportID;
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

	    @Override
	    public String toString() {
	        return String.format("%s %s, passport ID: %s", firstName, lastName, passportID);
	    }
}
