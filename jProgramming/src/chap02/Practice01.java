package chap02;

import java.util.Scanner;

/*
 * Practice 01 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �� �ڸ� �Է��ϼ���: ");

		char character = scan.nextLine().charAt(0);

		if (65 <= character && character <= 90) {
			character += 32;
		} else if (97 <= character && character <= 122) {
			character -= 32;
		} else {
			System.out.println("�����ڰ� �ƴմϴ�.");
			System.exit(0);
		}

		System.out.println(character);

		scan.close();
	}

}
