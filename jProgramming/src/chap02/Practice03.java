package chap02;

import java.util.Scanner;

/*
 * Practice 03 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int money, tmp;

		System.out.print("�׼��� �Է��ϼ���: ");
		money = scan.nextInt();

		tmp = money / 50000;
		if (tmp > 0) {
			System.out.println("���� ���� " + tmp + " ��");
			money -= tmp * 50000;
		}

		tmp = money / 10000;
		if (tmp > 0) {
			System.out.println("�� ���� " + tmp + " ��");
			money -= tmp * 10000;
		}

		tmp = money / 5000;
		if (tmp > 0) {
			System.out.println("��õ ����  " + tmp + " ��");
			money -= tmp * 5000;
		}

		tmp = money / 1000;
		if (tmp > 0) {
			System.out.println("õ ���� " + tmp + " ��");
			money -= tmp * 1000;
		}

		tmp = money / 500;
		if (tmp > 0) {
			System.out.println("����� " + tmp + " ��");
			money -= tmp * 500;
		}

		tmp = money / 100;
		if (tmp > 0) {
			System.out.println("��� " + tmp + " ��");
			money -= tmp * 100;
		}

		tmp = money / 50;
		if (tmp > 0) {
			System.out.println("���ʿ� " + tmp + " ��");
			money -= tmp * 50;
		}

		tmp = money / 10;
		if (tmp > 0) {
			System.out.println("�ʿ� " + tmp + " ��");
			money -= tmp * 10;
		}

		tmp = money / 5;
		if (tmp > 0) {
			System.out.println("���� " + tmp + " ��");
			money -= tmp * 5;
		}

		System.out.println("�Ͽ� " + money + " ��");

		scan.close();
	}

}
