package by.epam.jonline.programming_with_classes.agregation_and_composition.task4;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность 
блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. Вычисление 
общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный 
и отрицательный балансы отдельно.*/

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("BelinvestBank");

        Client client1 = new Client("Иван", "Иванов", "АС774453");
        Client client2 = new Client("Сергей", "Чернов", "ТР74676786");

        Logic.addNewClient(bank, client1);
        Logic.addNewClient(bank, client2);
        
        Logic.openAccount(client1, new Account(28756, 500.0));
        Logic.openAccount(client2, new Account(5765474, 300.0));
        Logic.openAccount(client2, new Account(7475474, 100.0));

        View.printAccountInformation(Logic.getAccount(bank, 28756));
        
//        Logic.blockAccount(client1.getAccounts().get(0));
//        View.printAccountInformation(Logic.getAccount(bank, 28756));
//        
//        Logic.unlockAccount(client1.getAccounts().get(0));
//        View.printAccountInformation(Logic.getAccount(bank, 28756));
//        
//        View.printListOfAccountInformation(Logic.sortAccountsByBalance(bank));
//        
//        View.printTotalBalanceOfAccounts(Logic.getTotalBalanceOfAccounts(bank));
//        
//        View.printTotalPositiveBalanceOfAccounts(Logic.getTotalBalanceOfPositiveAccounts(bank));
//        
//        View.printTotalNegativeBalanceOfAccounts(Logic.getTotalBalanceOfNegativeAccounts(bank));
       
        
	}

}
