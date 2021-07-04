package by.epam.jonline.basics_of_oop.task5B.entity;

public class Packing {
	private PackingType packingType;
	private double price;

    public Packing(PackingType packingType) {
        price = packingType.getPrice();
        this.packingType = packingType;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return packingType.getName();
    }
}
