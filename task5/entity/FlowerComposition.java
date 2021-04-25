package by.epam.jonline.basics_of_oop.task5.entity;

import java.util.ArrayList;
import java.util.List;

public class FlowerComposition {
	private Packaging packaging = new Packaging();
	private List<Flower> flowers = new ArrayList<Flower>();
	
	public void addFlower(Flower flower) {
		flowers.add(flower);
	}
	
	public List<Flower> getFlowers() {
		return flowers;
	}

	
}
