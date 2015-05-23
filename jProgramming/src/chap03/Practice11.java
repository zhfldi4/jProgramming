package chap03;

import java.util.Scanner;
/*
 * Practice 11 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int money, tmp;
		int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		System.out.print("액수를 입력하세요: ");
		money = scan.nextInt();

		for (int i = 0; i < unit.length; i++) {
			tmp = money / unit[i];
			
			if (tmp > 0) {
				System.out.println(unit[i] + "원 권 " + tmp);
				money -= tmp * unit[i];
			}
		}
		
		
		scan.close();
	}
}
