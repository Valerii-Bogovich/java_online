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
			   y =  7.5,
			   z = 3.5,
			   t = 5.0;
		System.out.println(calculateTetragonSquare(x,y,z,t));
//		printTetragonSquare(calculateTetragonSquare(x,y,z,t));
    

}

	public static double calculateTetragonSquare(double x, double y, double z, double t) {
		double diagonal = Math.sqrt(x * x + y * y),
					 square1 = x * y / 2,
					 p = (diagonal + z + t) / 2,
					 square2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));
		
        return  square1 + square2;

	}
	
	public static void printTetragonSquare(double square) {
		System.out.println("Площадь четырёхугольника равна " + square);
	}

}
