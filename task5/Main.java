package by.epam.jonline.programming_with_classes.agregation_and_composition.task5;

import java.util.List;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Иван", "Иванов", 50.0);
		
		TourAgency tourAgency = new TourAgency("Travels");
		
		tourAgency.addTourPackage(new TourPackage("USA", "Clivlend", TourPackageType.CRUISE,
                Transport.SHIP, TypeOfFood.BREAKFAST, 12, 1099.99));
		tourAgency.addTourPackage(new TourPackage("Greece", "Afines", TourPackageType.RECREATION,
                Transport.PLANE, TypeOfFood.ALL_INCLUSIVE, 14, 1699.89));
		tourAgency.addTourPackage(new TourPackage("France", "Paris", TourPackageType.EXCURSION,
                Transport.BUS, TypeOfFood.NOT_INCLUDET, 5, 400.10));
		tourAgency.addTourPackage(new TourPackage("Italy", "Roma", TourPackageType.RECREATION,
                Transport.PLANE, TypeOfFood.BREAKFAST, 15, 1400.20));
		tourAgency.addTourPackage(new TourPackage("UK", "London", TourPackageType.TREATMENT,
                Transport.BUS, TypeOfFood.ALL_INCLUSIVE, 8, 500.80));
		
		 List<TourPackage> selectByType = Logic.selectByTourPackageType(tourAgency, TourPackageType.EXCURSION);
	     View.printTours(selectByType);
	     
	     List<TourPackage> selectByTransport = Logic.selectByTransport(tourAgency, Transport.BUS);
	     View.printTours(selectByTransport);
	     
	     List<TourPackage> selectByDayNumber = Logic.selectByDayNumber(tourAgency, 10);
	     View.printTours(selectByDayNumber);

	     View.printTours(Logic.sortByPrice(tourAgency.getTourPackages()));
	     
	}

}
