package by.epam.jonline.basics_of_oop.task5.view;

import by.epam.jonline.basics_of_oop.task5.entity.Flower;
import by.epam.jonline.basics_of_oop.task5.entity.FlowerComposition;

public class View {
	
	public void printFlowerComposition(FlowerComposition flowerComposition) {
		System.out.print("Flower composition : packaging ");
		for (Flower flower : flowerComposition.getFlowers()) {
			System.out.print(" + " + flower );
		}
	}

}
