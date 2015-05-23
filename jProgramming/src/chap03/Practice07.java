package chap03;

/*
 * Practice 07 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice07 {
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int i, j;
		
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				int rand = (int) Math.round(Math.random() * 9 + 1);
				arr[i][j] = rand;
			}
		}
		
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}

}
