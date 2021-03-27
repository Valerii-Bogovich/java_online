package by.epam.jonline.programming_with_classes.agregation_and_composition.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.epam.jonline.programming_with_classes.agregation_and_composition.task4.Account;

public class Logic {
	
	 public static List<TourPackage> selectByTourPackageType (TourAgency tourAgency, TourPackageType type){
	        List<TourPackage> packages = new ArrayList<TourPackage>();
	        
	        for (TourPackage tour : tourAgency.getTourPackages()) {
	            if (tour.getType().name().equals(type.name())) {
	                packages.add(tour);
	            }
	        }
	        return packages;
	  }
	 
	 public static List<TourPackage> selectByTransport (TourAgency tourAgency, Transport transport){
	        List<TourPackage> packages = new ArrayList<TourPackage>();
	        
	        for (TourPackage tour : tourAgency.getTourPackages()) {
	            if (tour.getTransport().name().equals(transport.name())) {
	                packages.add(tour);
	            }
	        }
	        return packages;
	    }
	 
	 public static List<TourPackage> selectByDayNumber (TourAgency tourAgency, int days){
	        List<TourPackage> packages = new ArrayList<TourPackage>();
	        
	        for (TourPackage tour : tourAgency.getTourPackages()) {
	            if (tour.getNumberOfDays() == days) {
	                packages.add(tour);
	            }
	        }
	        return packages;
	    }
	 
	 public static List<TourPackage> sortByPrice(List<TourPackage> tourPackages) {
		 List<TourPackage> sortedPackages = new ArrayList<TourPackage>();
		 
		 for (TourPackage tourPackage : tourPackages) {
			 sortedPackages.add(tourPackage);
		 }
		 
		 Collections.sort(sortedPackages, new TourPackageByPriceComparator());
		 
		 return sortedPackages;
	 }
}
