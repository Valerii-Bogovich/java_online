package by.epam.jonline.programming_with_classes.agregation_and_composition.task4;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {
	
	public int compare(Account account1, Account account2) {
			
			if (account1.getBalance() > account2.getBalance())
				return 1;
			if (account1.getBalance() > account2.getBalance())
				return  -1;
			else
				return 0;
	}
	
}
