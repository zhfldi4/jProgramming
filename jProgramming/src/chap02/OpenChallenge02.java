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

		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
		System.out.print("ö��>>");
		chul = scan.next();
		System.out.print("����>>");
		young = scan.next();

		switch (chul) {
		case "����":
			if (young.equals("����")) {
				System.out.println("�����ϴ�.");
			} else if (young.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			} else {
				System.out.println("ö���� �̰���ϴ�.");
			}
			break;

		case "����":
			if (young.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else if (young.equals("����")) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("���� �̰���ϴ�.");
			}
			break;

		case "��":
			if (young.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			} else if (young.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else {
				System.out.println("�����ϴ�.");
			}
			break;

		default:
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			System.exit(0);
		}

		scan.close();
	}

}
