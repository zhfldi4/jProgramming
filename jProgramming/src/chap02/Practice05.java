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

		System.out.print("�� ���� ���̸� �Է��ϼ���.");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		int max = (a > b) ? a : b;
		max = (max > c) ? max : c;

		if (a + b + c - max > max) {
			System.out.println("�ﰢ�� ����");
		} else {
			System.out.println("�ﰢ�� �Ұ���");
		}

		scan.close();
	}

}
