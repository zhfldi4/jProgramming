package chap03;

import java.util.Scanner;

/*
 * Practice 01 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x;
		System.out.print("임의의 정수를 입력하시오.");
		x = scan.nextInt();
		
		for (int i = x; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
