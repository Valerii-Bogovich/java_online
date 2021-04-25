package by.epam.jonline.basics_of_oop.task5.logic;

import by.epam.jonline.basics_of_oop.task5.entity.FlowerComposition;
import by.epam.jonline.basics_of_oop.task5.entity.FlowerFactory;
import by.epam.jonline.basics_of_oop.task5.entity.FlowerTypes;

public class Logic {
	private FlowerFactory flowerFactory = new FlowerFactory();
	
	public FlowerComposition makeFlowerComposition(String ...strings) {
		FlowerComposition flowerComposition = new FlowerComposition();
		for (String string : strings) {
			flowerComposition.addFlower(flowerFactory.getFlower(FlowerTypes.valueOf(string.toUpperCase())));
		}
		
		return flowerComposition;
	}

}
