package by.epam.jonline.basic.line.programs.main;

//Найти (в радианах, в градусах) все углы треугольника со сторонами a, b, c

public class Main29 {

	public static void main(String[] args) {
		double a = 12.0, b = 10.0, c = 11.0;
		double ab_rad = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - 
				- Math.pow(c, 2)) / 2 * a * b);
		
		double ab_grad = ab_rad * 180 / Math.PI ;
		double ac_rad = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - 
				- Math.pow(b, 2)) / 2 * a * c);
		double ac_grad = ac_rad * 180 / Math.PI ;
		double bc_rad = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - 
				- Math.pow(a, 2)) / 2 * b * c);
		double bc_grad = bc_rad * 180 / Math.PI ;
		System.out.println(Math.acos(7));
	//System.out.format("Углы треугольника в радианах, градусах:  %.1f рад, %.1f град; %.1f рад, %.1f град"
	//		+ "%.1f рад, %.1f град", ab_rad, ab_grad, ac_rad, ac_grad, bc_rad, bc_grad);
		


	}

}
