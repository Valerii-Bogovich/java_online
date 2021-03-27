package by.epam.jonline.programming_with_classes.agregation_and_composition.task5;

import java.util.ArrayList;
import java.util.List;

public class View {
	
	public static void printTours (List<TourPackage> tourPackages) {
	        if (tourPackages.size() == 0) {
	            System.out.println("Таких путёвок нет");
	        }
	        
	        for (TourPackage tourPackage : tourPackages) {
	            System.out.printf("Туристическая путёвка в %s, %s, тип: %s, транспорт : %s, еда : %s, продолжительность %d  дней, цена : %.2f долларов.\n",
	                               tourPackage.getCountry(), tourPackage.getCity(), tourPackage.getType(), tourPackage.getTransport(), tourPackage.getFood(), tourPackage.getNumberOfDays(), tourPackage.getPrice());
	        }
	        System.out.println();
	 }
}
