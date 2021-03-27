package by.epam.jonline.programming_with_classes.agregation_and_composition.task5;

import java.util.Comparator;

import by.epam.jonline.programming_with_classes.agregation_and_composition.task4.Account;

public class TourPackageByPriceComparator implements Comparator<TourPackage> {

	public int compare(TourPackage tourPackage1, TourPackage tourPackage2) {
		
		if (tourPackage1.getPrice() > tourPackage2.getPrice())
			return 1;
		if (tourPackage1.getPrice() < tourPackage2.getPrice())
			return  -1;
		else
			return 0;
	}

	
}
