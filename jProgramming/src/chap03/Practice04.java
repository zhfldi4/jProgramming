package chap03;

import java.util.Scanner;

/*
 * Practice 04 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, tmp;
		System.out.print("두 수를 입력하시오");
		a = scan.nextInt();
		b = scan.nextInt();

		while (b != 0) {
			if (b == 0)
				break;
			tmp = a;
			a = b;
			b = tmp % b;

		}

		System.out.print(a);

		scan.close();
	}

}
