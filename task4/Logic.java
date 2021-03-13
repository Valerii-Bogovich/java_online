package by.epam.jonline.programming_with_classes.agregation_and_composition.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic {
	
	 public static void blockAccount(Account account){
	        account.setOpen(false);
	 }

	 public static void unlockAccount(Account account) {
	    	account.setOpen(true);
	 }
	 
	 public static void openAccount(Client client, Account account) {
		 client.getAccounts().add(account);
	 }
	 
	
	 
	 public static void addNewClient(Bank bank, Client client) {
	        bank.getClients().add(client);
	 }
	 
	 public static Client getClient (Bank bank, String passportID) {
	        for (Client client : bank.getClients()) {
	            if (client.getPassportID().equals(passportID)) {
	                return client;
	            }
	        }
	        return null;
	    }
	 
	 public static Account getAccount (Bank bank, long id) {
	        for (Client client : bank.getClients()) {
	        	for (Account account : client.getAccounts())
		            if (account.getId() == id) {
		                return account;
		            }
	        }
	        return null;
	    }
	 
	 public static List<Account> sortAccountsByBalance(Bank bank) {
		 List<Account> accounts = new ArrayList<Account> ();
		 
		 for (Client client : bank.getClients()) {
			 for (Account account : client.getAccounts()) {
				 accounts.add(account);
			 }
		 }
		 Collections.sort(accounts, new AccountComparator());
		 
		 return accounts;
		 
	    }

	 
	 public static double getTotalBalanceOfAccounts(Bank bank) {
	        double balance = 0;
	        
	        for (Client client : bank.getClients()) {
				 for (Account account : client.getAccounts()) {
					 balance += account.getBalance();
				 }
			 }
	        
	         return balance;
	 }
	 
	 public static double getTotalBalanceOfPositiveAccounts(Bank bank) {
	        double balance = 0;
	        
	        for (Client client : bank.getClients()) {
				 for (Account account : client.getAccounts()) {
					 if (account.getBalance() > 0)
					 balance += account.getBalance();
				 }
			}
	        
	        return balance;
	        
	 }
	 
	 public static double getTotalBalanceOfNegativeAccounts(Bank bank) {
	        double balance = 0;
	        
	        for (Client client : bank.getClients()) {
				 for (Account account : client.getAccounts()) {
					 if (account.getBalance() < 0)
					 balance += account.getBalance();
				 }
			}
	        
	        return balance;
	        
	 }
}
