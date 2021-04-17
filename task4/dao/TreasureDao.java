package by.epam.jonline.basics_of_oop.task4.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epam.jonline.basics_of_oop.task4.bean.Treasure;

public class TreasureDao extends AbstractTreasureDao {

	@Override
	public  List<Treasure> getListOfTreasures() {
		List<Treasure> listOfTreasures = new ArrayList<Treasure>();
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\by\\java-online-introdaction\\data\\treasure.txt"))){
			String str;
			while ((str = br.readLine()) != null) {
				String[] strings = str.split("\\s");
				listOfTreasures.add(new Treasure(Integer.parseInt(strings[0]), strings[1], Double.parseDouble(strings[2])));
				
			}
			
		} catch(IOException ex){
            
           System.out.println(ex.getMessage());
          } 
		
		return listOfTreasures;
		
		
	}

	public  void main(String[] args) {
		getListOfTreasures();
	}
	
	
	
}
