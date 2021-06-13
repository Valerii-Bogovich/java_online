package by.epam.jonline.algoritmization.decomposition.main;

/* На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, 
 * между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив
 */
public class Main4 {

	public static void main(String[] args) {
		double[][] arrayOfPoints =  {{5.0,8.0},{7.0,5.0},{-6.0,12.0},{6.0,2.0}};
		int[] pairOfDots = findPairOfDotsWithMaxDistance(arrayOfPoints);
		System.out.println("����� ������� ���������� ����� ������ " + pairOfDots[0] + " � ������ " + pairOfDots[1]);

	}
	
	public static int[][] findPairOfDotsWithMaxDistance(double[][] arrayOfPoints) {
		double max = 0;
		int a = 0, b = 0;
		for (int i = 0; i < arrayOfPoints.length - 1; i++) {
			for (int j = i + 1; j < arrayOfPoints.length; j++ ) {
				
				
				if (findDistance(arrayOfPoints[i], arrayOfPoints[j]) > max) {
					max = (findDistance(arrayOfPoints[i], arrayOfPoints[j]));
					a = i + 1;
					b = j + 1;
				}
			}
		}
		int[][] pairOfDots = {arrayOfPoints[]a, b};
		return pairOfDots;
	}
	
	 public static double findDistance(double[] pointA, double[] pointB) {
		 double distance = Math.sqrt(Math.pow(Math.abs(pointA[0] - pointB[0]),2) + Math.pow(Math.abs(pointA[1] - pointB[1]),2));
		 return distance;
	 }
	 
	 public static void printPairOfDotsWithMaxDistance(int[] pairOfDots) {
		 System.out.println()
	 }

}
