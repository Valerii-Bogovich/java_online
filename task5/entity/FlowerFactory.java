package by.epam.jonline.basics_of_oop.task5.entity;

public class FlowerFactory {
	public Flower getFlower(FlowerTypes type) {
        Flower toReturn = null;
        switch (type) {
            case CLOVE:
                toReturn = new Clove("Clove");
                break;
            case ROSE:
                toReturn = new Rose("Rose");
                break;
            case TULIP:
                toReturn = new Tulip("Tulip");
                break;
            default:
                throw new IllegalArgumentException("Wrong flower type:" + type);
        }
        return toReturn;
    }
}
