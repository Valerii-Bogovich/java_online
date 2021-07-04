package by.epam.jonline.basics_of_oop.task5B.entity;

public enum PackingType {
	CARDBOARD_BOX("Cardboard box", 1.5),
    WRAPPING_PAPPER("Wrapping papper", 0.2),
    GIFT_BAG("Gift bag", 1.0),
    GLASS_GIFT_WRAP("Glass gift wrap", 2.0);
	
	private String name;
    private double price;
    
    PackingType(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
