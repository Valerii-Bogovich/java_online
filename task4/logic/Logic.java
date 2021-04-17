package by.epam.jonline.basics_of_oop.task4.logic;

import java.util.List;

import by.epam.jonline.basics_of_oop.task4.bean.Treasure;
import by.epam.jonline.basics_of_oop.task4.dao.TreasureDao;

public class Logic {
	private static TreasureDao trDao = new TreasureDao();
	private static List<Treasure> listOfTreasures = trDao.getListOfTreasures();
	
	public static Treasure getTheMostExpensiveTreasure() {
		
		Treasure mostExpensiveTreasure = null;
		double max = 0;
		
		for (Treasure treasure : listOfTreasures) {
			if (treasure.compareTo(mostExpensiveTreasure) > 0) {
				mostExpensiveTreasure = treasure;
			}
		}
		
		return mostExpensiveTreasure;
	}

	
	public static double getTreasuresForGivenAmount(double givenSum) {
		double sum = 0;
		
		for (Treasure treasure : listOfTreasures) {
			if (sum > givenSum) 
				break;
			 else 
				sum += treasure.getPrice();
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		getTheMostExpensiveTreasure();
	}

}
