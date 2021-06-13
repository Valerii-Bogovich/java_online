package Algoritmization;

public class Arrays4_4 {

	public static void main(String[] args) {
		System.out.println(maxDistance(new double[] {4, 6, 5, 7, 6, 8}, new double[] {6, 5, 4, 8, 4, 7}));

	}
	public static double maxDistance(double[] x, double[] y) {
		double max = 0;
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++ ) {
				double d = Math.sqrt(Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2));
				if (d > max) {
					max = d;
				}
			}
		}
		return max;
	}
}
