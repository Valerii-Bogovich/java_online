package by.epam.jonline.programming_with_classes.agregation_and_composition.task4;

public class Account {

    private long id;
    private double balance;
    private boolean isOpen = true;

    public Account(long id, double balance) {
    	this.id = id;
        this.balance = balance;
        
    }

   
    public long getId() {
		return id;
	}


    public void setId(long id) {
		this.id = id;
	}


    public double getBalance() {
		return balance;
	}


    public void setBalance(double balance) {
		this.balance = balance;
	}


    public boolean isOpen() {
		return isOpen;
	}



	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", isOpen=" + isOpen + "]";
	}



	

   

}
