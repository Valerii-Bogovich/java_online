package by.epam.jonline.strings.part1.main;

/*Удалить в строке все лишние пробелы, то есть 
серии подряд идущих пробелов заменить на одиночные 
пробелы. Крайние пробелы в строке удалить*/

public class Main5 {

	public static void main(String[] args) {
		String str = " gyg  jgjgj7   hh ";
		System.out.println(deleteAllExtraSpaces(str));
	}
	
	public static String deleteAllExtraSpaces(String str) {
		StringBuilder strBuilder = new StringBuilder();
		char[] chars = str.toCharArray();
		int count = 0;
		String letter = "";
		for (int i = 0; i < str.length(); i++) {
			for ()
			while (chars[i] == ' ') {
				count++;
			}
			if (chars[i] == ' ') {
				c
			}
			if ((i != 0 && chars[i] != ' ') || (i != str.length() - 1 &&
					chars[i] != ' ')){
			 
			
				strBuilder.append(str.charAt(i));
			}
		}
		letter = strBuilder.toString();
		return letter;
	}

}
