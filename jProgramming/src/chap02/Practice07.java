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
		System.out.print("두 좌표를 입력하시오.");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if (50 <= x && x <= 100) 
			if (50 <= y && y <= 100)
				System.out.println("사각형 안에 점이 있습니다");
		
		scan.close();
	}

}
