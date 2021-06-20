package by.epam.jonline.basics_of_oop.task4.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import by.epam.jonline.basics_of_oop.task4.bean.Treasure;

public abstract class AbstractTreasureDao {
	
	public abstract  List<Treasure> getListOfTreasures() throws FileNotFoundException, NumberFormatException, IOException;
	
	
	
}
