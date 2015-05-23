package chap02;

import java.util.Scanner;

/*
 * Practice 02 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter("\\s|-");
		
		System.out.print("주민등록번호를 입력하세요: ");
		String identification = scan.next();
		
		System.out.println(identification);
		
		scan.close();
	}

}
