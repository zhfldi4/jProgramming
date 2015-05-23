package chap03;

import java.util.Scanner;

/*
 * Practice 02 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x;
		System.out.print("알파벳 한 문자를 입력하시오");
		x = (int)scan.nextLine().charAt(0);
		
		for (int i = x; i >= 97; i--) {
			for (int j = 97; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
		
		scan.close();
	}

}
