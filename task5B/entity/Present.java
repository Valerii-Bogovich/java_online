package by.epam.jonline.basics_of_oop.task5B.entity;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private double price;
    private Packing pack;
    private List<Sweet> sweets;

    

    public Present(double price, Packing pack, List<Sweet> sweets) {
		
		this.price = price;
		this.pack = pack;
		this.sweets = sweets;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Packing getPack() {
		return pack;
	}

	public void setPack(Packing pack) {
		this.pack = pack;
	}

	

	public List<Sweet> getSweets() {
        return sweets;
    }


    @Override
    public String toString() {
        return  "Present : " + "\n" +
                "Price :  " + String.format("%.1f", getPrice()) +
                "Packing :  " + getPack() + 
                "Sweets :  " + sweets;

    }

}
