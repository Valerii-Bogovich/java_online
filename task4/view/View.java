package by.epam.jonline.basics_of_oop.task4.view;

import java.util.List;

import by.epam.jonline.basics_of_oop.task4.bean.Treasure;

public class View {
	public static void printListOfTheMostExpensiveTreasures(List<Treasure> listOfTreasures) {
		System.out.println("Самые дорогие сокровища :");
		for (Treasure treasure : listOfTreasures) {
			System.out.println(treasure);
		}
	}
	
	public static void printListOfTreasuresForAGivenSum(List<Treasure> listOfTreasures) {
		System.out.println("Список сокровищ на заданную сумму :");
		for (Treasure treasure : listOfTreasures) {
			System.out.println(treasure);
		}
	}
}
