package chap02;

import java.util.Scanner;

/*
 * Practice 04 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int clapPoint, count = 0;

		System.out.print("1~99까지 정수를 입력하세요.");
		clapPoint = scan.nextInt();

		if (((clapPoint / 10) % 3) == 0 && clapPoint / 10 != 0)
			count++;

		if ((clapPoint - (clapPoint / 10) * 10) % 3 == 0)
			count++;

		if (count == 2) {
			System.out.println("박수짝짝");
		} else if (count == 1) {
			System.out.println("박수짝");
		}

		scan.close();
	}

}
