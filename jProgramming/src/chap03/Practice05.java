package chap03;

import java.util.Scanner;

/*
 * Practice 05 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int arr[] = new int[10];
		int i;

		System.out.print("10개의 수를 입력하시오");
		for (i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		for (i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0)
				System.out.print(arr[i] + " ");
		}

		scan.close();
	}

}
