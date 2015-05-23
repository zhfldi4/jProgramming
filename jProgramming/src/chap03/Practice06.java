package chap03;

import java.util.Scanner;
/*
 * Practice 06 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int arr[] = new int[10];
		int i, tmp;

		System.out.print("10개의 정수를 입력하시오");
		for (i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		for (i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		scan.close();
	}

}
