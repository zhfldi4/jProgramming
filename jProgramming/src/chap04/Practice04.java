package chap04;

/*
 * Practice 04 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice04 {
	public static void main(String[] args) {
		int s1[] = { 1, 3, 5, 7, 9 };
		int s2[] = { 2, 4, 6, 8 };

		int arr[] = ArrayUtility2.concat(s1, s2);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		s1 = ArrayUtility2.remove(arr, s2);

		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
	}
}
