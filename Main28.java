package by.epam.jonline.basic.cycles.main;

/* Написать программу в которой вводится два операнда X и Y 
 * и знак операции (+,-,*,/). Вычислить результат Z в 
 * зависимости от знака. Предусмотреть реакции на неверный
 * знак операции, а также на ввод Y = 0 при делении. Организовать возможность 
 * многократных вычислений без перезагрузки программы. В качестве символа для
 * прекращения вычислений взять символ "0"
 */

import java.util.Scanner;

public class Main28 {

	public static void main(String[] args) {
		double res = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите действительное число X");
		
		while(!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Ошибка! Введите ещё раз");
			
		}
		double x = sc.nextDouble();
		
		System.out.println("Введите действительное число Y");
		
		while(!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Ошибка! Введите ещё раз");
			
		}
		double y = sc.nextDouble();
		
		System.out.println("Введите знак операции : +, -, *, /");
		
//		while(!sc.hasNext("//+|-|/|*")) {
//			sc.next();
//			System.out.println("Ошибка! Введите ещё раз");
//			
//		}
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		switch(ch) {
			case '*':  res = x * y;
			break;
			case '+':  res = x + y;
			break;
			case '-':  res = x - y;
			break;
			case '/':  res = x / y;
			break;
		default:
			System.out.println("Неверный знак операции");
		}
		System.out.println(res);
		

	}

}
