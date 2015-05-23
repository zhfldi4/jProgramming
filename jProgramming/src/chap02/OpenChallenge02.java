package chap02;

import java.util.Scanner;

/*
 * Open Challenge 02 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class OpenChallenge02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String chul;
		String young;

		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수>>");
		chul = scan.next();
		System.out.print("영희>>");
		young = scan.next();

		switch (chul) {
		case "가위":
			if (young.equals("가위")) {
				System.out.println("비겼습니다.");
			} else if (young.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			} else {
				System.out.println("철수가 이겼습니다.");
			}
			break;

		case "바위":
			if (young.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			} else if (young.equals("바위")) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("영희가 이겼습니다.");
			}
			break;

		case "보":
			if (young.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			} else if (young.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			} else {
				System.out.println("비겼습니다.");
			}
			break;

		default:
			System.out.println("잘못된 값을 입력하셨습니다.");
			System.exit(0);
		}

		scan.close();
	}

}
