package by.epam.jonline.algoritmization.decomposition.main;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/*Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
 * если угол между сторонами длиной X и Y— прямой.
 */

public class Main9 {

	public static void main(String[] args) {
		double x = 6.0,
			   y =  75,
			   z = 3.5,
			   t = 5.0;
		System.out.println(calculateTetragonSquare(x,y,z,t));
//		printTetragonSquare(calculateTetragonSquare(x,y,z,t));
    

}

	public static BigDecimal calculateTetragonSquare(double x, double y, double z, double t) {
		double diagonal = (float)Math.sqrt(x * x + y * y),
					 square1 = x * y / 2,
					 p = (diagonal + z + t) / 2;
		MathContext context = new MathContext(5, RoundingMode.HALF_UP);
		BigDecimal square2 = new BigDecimal(Math.sqrt(p * (p - diagonal) * (p - z) * (p - t)), context),
				   square1B = new BigDecimal(square1) ;
	
        return  square1B.add(square2);

	}
	
	public static void printTetragonSquare(double square) {
		System.out.println("Площадь четырёхугольника равна " + square);
	}

}
