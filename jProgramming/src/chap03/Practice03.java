package chap03;

import java.util.Scanner;

/*
 * Practice 03 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x, tmp;
		int count = 0;
		System.out.print("0 보다 큰 임의의 정수를 입력하시오");
		x = scan.nextInt();

		String binary = "";

		while (x != 1) {
			tmp = x % 2;

			binary += Integer.toString(tmp);

			if (tmp == 1) {
				count++;
			}

			x /= 2;
		}

		binary += Integer.toString(x);

		for (int i = binary.length() - 1; i >= 0; i--) {
			System.out.print(binary.charAt(i));
		}

		System.out.println("\n" + count);

		scan.close();
	}

}
