package chap02;

import java.util.Scanner;

/*
 * Practice 06 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year;
		System.out.print("�⵵�� �Է��ϼ���.");
		year = scan.nextInt();
		
		if ((year % 400) == 0) {
			System.out.println("����");
		} else if ((year % 4) == 0 && (year % 100) != 0) {
			System.out.println("����");
		} else {
			System.out.print("���");
		}
		
		scan.close();
	}

}
