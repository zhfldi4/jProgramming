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
		System.out.print("������ ������ �Է��Ͻÿ�.");
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
