package by.epam.jonline.basic.line.programs.main;

//Составить программу перевода радианной меры угла в градусы, минуты и секунды

public class Main28 {

	public static void main(String[] args) {
		double rad = Math.PI /3;
		double grad = 180 * rad / Math.PI;
		int gradus = (int)grad;
		double min = (grad - gradus) / 0.17;
		int minutes = (int)min;
		int sec = (int)((min - minutes) / 0.0003);
		
		System.out.format("Угол равный %.2d радианам равен %.0d градусов %.0d, %.0d минутам"
				+ " %.0d секундам", rad, gradus, minutes, sec);

	}

}
