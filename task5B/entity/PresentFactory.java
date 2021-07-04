package by.epam.jonline.basics_of_oop.task5B.entity;



public class PresentFactory {
	public Sweet getSweet(String sweetName) {
		OS os = null;
        if (inputos.equals("windows")) {
            os = new windowsOS();
        } else if (inputos.equals("linux")) {
            os = new linuxOS();
        } else if (inputos.equals("mac")) {
            os = new macOS();
        }
        return os;
    }
}
