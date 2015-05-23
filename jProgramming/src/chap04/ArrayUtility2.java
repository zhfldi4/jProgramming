package chap04;

/*
 * ArrayUtility Class 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class ArrayUtility2 {
	public static int[] concat(int[] s1, int[] s2) {
		int arr[] = new int[s1.length + s2.length];

		for (int i = 0; i < s1.length; i++) {
			arr[i] = s1[i];
		}

		for (int i = 0; i < s2.length; i++) {
			arr[i + s1.length] = s2[i];
		}

		return arr;
	}

	public static int[] remove(int[] s1, int[] s2) {

		int length = s1.length - s2.length;
		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			arr[i] = s1[i];
		}

		return arr;
	}
}
