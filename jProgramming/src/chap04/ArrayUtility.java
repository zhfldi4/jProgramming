package chap04;

/*
 * ArrayUtility Class 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class ArrayUtility {
	public static double[] intToDouble(int[] source) {
		double arr[] = new double[source.length];

		for (int i = 0; i < source.length; i++) {
			arr[i] = (double) source[i];
		}

		return arr;
	}

	public static int[] doubleToInt(double[] source) {
		int arr[] = new int[source.length];

		for (int i = 0; i < source.length; i++) {
			arr[i] = (int) Math.round(source[i]);
		}

		return arr;
	}
}
