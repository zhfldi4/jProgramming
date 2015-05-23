package chap02;

import java.util.Scanner;

/*
 * Practice 08 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x1, x2;
		int y1, y2;
		System.out.print("두 점 (x1, y1), (x2, y2)의 좌표를 입력하세요.");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();

		if (50 <= x1 && x1 <= 100 || 50 <= x2 && x2 <= 100) 
			if (50 <= y1 && y1 <= 100 || 50 <= y2 && y2 <= 100)
				System.out.println("사각형이 겹칩니다");

		
		scan.close();
	}

}
