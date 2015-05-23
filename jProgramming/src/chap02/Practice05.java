package chap02;

import java.util.Scanner;

/*
 * Practice 05 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c;

		System.out.print("세 변의 길이를 입력하세요.");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		int max = (a > b) ? a : b;
		max = (max > c) ? max : c;

		if (a + b + c - max > max) {
			System.out.println("삼각형 가능");
		} else {
			System.out.println("삼각형 불가능");
		}

		scan.close();
	}

}
