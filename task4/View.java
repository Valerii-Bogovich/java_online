package by.epam.jonline.programming_with_classes.agregation_and_composition.task4;

import java.util.List;

public class View {
	
	 public static String printAccountInformation(Account account) {
	        String status = account.isOpen() ? "счёт открыт" : "счёт заблокирован";
	        return String.format("Счёт с id %f с балансом %d %s", account.getId(), account.getBalance(), status);
	 }
    
	 public static void printListOfAccountInformation(List<Account> listOfAccounts) {
		 for (Account account : listOfAccounts) {
			 System.out.println(printAccountInformation(account));
		 }
	 }
	 
	 public static void printTotalBalanceOfAccounts(double balance) {
		 System.out.println("Общая сумма по счетам в банке равна " + balance);
	 }
	 
	 public static void printTotalPositiveBalanceOfAccounts(double balance) {
		 System.out.println("Общая сумма по счетам имеющим положительный баланс равна " + balance);
	 }
	 
	 public static void printTotalNegativeBalanceOfAccounts(double balance) {
		 System.out.println("Общая сумма по счетам имеющим отрицательный баланс равна " + balance);
	 }
	 
}
