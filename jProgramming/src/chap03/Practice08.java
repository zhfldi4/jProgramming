package chap03;

/*
 * Practice 08 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice08 {
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int i, j;
		int x, y;
		
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				arr[i][j] = 0;
			}
		}

		for (i = 0; i < 8; i++) {
			do {
				x = (int) Math.round(Math.random() * 3);
				y = (int) Math.round(Math.random() * 3);
			} while (arr[x][y] != 0);
			
			arr[x][y] = (int) Math.round(Math.random() * 9 + 1);
		}
		
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
