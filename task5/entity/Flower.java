package by.epam.jonline.basics_of_oop.task5.entity;

import java.time.LocalDate;

public abstract class Flower {
	private String flowerName;
	private double flowerCost;
	private LocalDate flowerDate;
	private double lengthOfStam;
	
	
	
	public Flower(String flowerName) {
		this.flowerName = flowerName;
		
		
	}

	public Flower(String flowerName, double flowerCost, LocalDate flowerDate, double lengthOfStam) {
		
		this.flowerName = flowerName;
		this.flowerCost = flowerCost;
		this.flowerDate = flowerDate;
		this.lengthOfStam = lengthOfStam;
	}

	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public double getFlowerCost() {
		return flowerCost;
	}

	public void setFlowerCost(double flowerCost) {
		this.flowerCost = flowerCost;
	}

	public LocalDate getFlowerDate() {
		return flowerDate;
	}

	public void setFlowerDate(LocalDate flowerDate) {
		this.flowerDate = flowerDate;
	}

	public double getLengthOfStam() {
		return lengthOfStam;
	}

	public void setLengthOfStam(double lengthOfStam) {
		this.lengthOfStam = lengthOfStam;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(flowerCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((flowerDate == null) ? 0 : flowerDate.hashCode());
		result = prime * result + ((flowerName == null) ? 0 : flowerName.hashCode());
		temp = Double.doubleToLongBits(lengthOfStam);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		if (Double.doubleToLongBits(flowerCost) != Double.doubleToLongBits(other.flowerCost))
			return false;
		if (flowerDate == null) {
			if (other.flowerDate != null)
				return false;
		} else if (!flowerDate.equals(other.flowerDate))
			return false;
		if (flowerName == null) {
			if (other.flowerName != null)
				return false;
		} else if (!flowerName.equals(other.flowerName))
			return false;
		if (Double.doubleToLongBits(lengthOfStam) != Double.doubleToLongBits(other.lengthOfStam))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  flowerName ;
	}
}
