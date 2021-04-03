package by.epam.jonline.basics_of_oop.task2;

public class View {
	
	public static void printInformationAboutBalance(double balance) {
		if (balance < 0) {
			System.out.println("На все эти покупки денег не хватит");
		} else {
			System.out.println("Покупки сделаны");
			System.out.println("Осталось денег : " + balance);
		}
	}

}
