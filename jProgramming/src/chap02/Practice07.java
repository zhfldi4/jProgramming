package chap02;

import java.util.Scanner;

/*
 * Practice 07 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x, y;
		System.out.print("�� ��ǥ�� �Է��Ͻÿ�.");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if (50 <= x && x <= 100) 
			if (50 <= y && y <= 100)
				System.out.println("�簢�� �ȿ� ���� �ֽ��ϴ�");
		
		scan.close();
	}

}
