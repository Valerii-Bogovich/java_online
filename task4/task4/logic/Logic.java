package by.epam.jonline.basics_of_oop.task4.logic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epam.jonline.basics_of_oop.task4.bean.Treasure;
import by.epam.jonline.basics_of_oop.task4.dao.TreasureDao;

public class Logic  {
	private TreasureDao trDao = new TreasureDao();
	private List<Treasure> listOfTreasures;
	
	
	
	public Logic() throws NumberFormatException, IOException {
		List<Treasure> listOfTreasures = trDao.getListOfTreasures();
	}


	public List<Treasure> getTheMostExpensiveTreasure() {
		List<Treasure> listOfTheMostExpensiveTreasures = new ArrayList();
		Treasure mostExpensiveTreasure = listOfTreasures.get(0) ;
		
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

	
	public List<Treasure> getTreasuresForGivenAmount(double givenSum) {
		List<Treasure> listOfTheTreasuresForAGivenSum = new ArrayList();
		
		for (Treasure treasure : listOfTreasures) {
			if (givenSum > treasure.getPrice()) {
			    givenSum -= treasure.getPrice();
			    listOfTheTreasuresForAGivenSum.add(treasure);
			} else {
				continue;
			}
			
		}
		
		return listOfTheTreasuresForAGivenSum;
	}


	public List<Treasure> getListOfTreasures() {
		return listOfTreasures;
	}


}
