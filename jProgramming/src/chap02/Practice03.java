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

		System.out.print("액수를 입력하세요: ");
		money = scan.nextInt();

		tmp = money / 50000;
		if (tmp > 0) {
			System.out.println("오만 원권 " + tmp + " 매");
			money -= tmp * 50000;
		}

		tmp = money / 10000;
		if (tmp > 0) {
			System.out.println("만 원권 " + tmp + " 매");
			money -= tmp * 10000;
		}

		tmp = money / 5000;
		if (tmp > 0) {
			System.out.println("오천 원권  " + tmp + " 매");
			money -= tmp * 5000;
		}

		tmp = money / 1000;
		if (tmp > 0) {
			System.out.println("천 원권 " + tmp + " 매");
			money -= tmp * 1000;
		}

		tmp = money / 500;
		if (tmp > 0) {
			System.out.println("오백원 " + tmp + " 개");
			money -= tmp * 500;
		}

		tmp = money / 100;
		if (tmp > 0) {
			System.out.println("백원 " + tmp + " 개");
			money -= tmp * 100;
		}

		tmp = money / 50;
		if (tmp > 0) {
			System.out.println("오십원 " + tmp + " 개");
			money -= tmp * 50;
		}

		tmp = money / 10;
		if (tmp > 0) {
			System.out.println("십원 " + tmp + " 개");
			money -= tmp * 10;
		}

		tmp = money / 5;
		if (tmp > 0) {
			System.out.println("오원 " + tmp + " 개");
			money -= tmp * 5;
		}

		System.out.println("일원 " + money + " 개");

		scan.close();
	}

}
