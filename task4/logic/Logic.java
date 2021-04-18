package by.epam.jonline.basics_of_oop.task4.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.jonline.basics_of_oop.task4.bean.Treasure;
import by.epam.jonline.basics_of_oop.task4.dao.TreasureDao;

public class Logic {
	private static TreasureDao trDao = new TreasureDao();
	private static List<Treasure> listOfTreasures = trDao.getListOfTreasures();
	
	public static List<Treasure> getTheMostExpensiveTreasure() {
		List<Treasure> listOfTheMostExpensiveTreasures = new ArrayList();
		Treasure mostExpensiveTreasure = null;
		
		for (Treasure treasure : listOfTreasures) {
			if (treasure.compareTo(mostExpensiveTreasure) > 0) {
				mostExpensiveTreasure = treasure;
			}
		}
		
		for (Treasure treasure : listOfTreasures) {
			if (treasure.compareTo(mostExpensiveTreasure) == 0) {
				listOfTheMostExpensiveTreasures.add(treasure);
			}
		}
		
		return listOfTheMostExpensiveTreasures;
	}

	
	public static List<Treasure> getTreasuresForGivenAmount(double givenSum) {
		List<Treasure> listOfTheTreasuresForAGivenSum = new ArrayList();
		double sum = 0;
		
		for (Treasure treasure : listOfTreasures) {
			if (sum > givenSum) 
				break;
			 else 
				sum += treasure.getPrice();
			listOfTheTreasuresForAGivenSum.add(treasure);
			
		}
		
		return listOfTheTreasuresForAGivenSum;
	}
	


}
