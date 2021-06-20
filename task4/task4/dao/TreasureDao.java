package by.epam.jonline.basics_of_oop.task4.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epam.jonline.basics_of_oop.task4.bean.Treasure;

public class TreasureDao extends AbstractTreasureDao {

	@Override
	public  List<Treasure> getListOfTreasures() throws NumberFormatException, IOException  {
		List<Treasure> listOfTreasures = new ArrayList<Treasure>();
		BufferedReader br = new BufferedReader(new FileReader("D:\\by\\java-online-introdaction\\data\\treasure.txt"));
			String str;
			while ((str = br.readLine()) != null) {
				String[] strings = str.split("\\s");
				listOfTreasures.add(new Treasure(Integer.parseInt(strings[0]), strings[1], Double.parseDouble(strings[2])));
				
			}
			
		
		
		return listOfTreasures;
		
		
	}

	
	
	
	
}
