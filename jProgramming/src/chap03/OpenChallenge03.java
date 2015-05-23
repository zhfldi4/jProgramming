package chap03;

import java.util.Scanner;
/*
 * Open Challenge 03 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class OpenChallenge03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int randNum = (int) Math.round(Math.random() * 98 + 1);
		boolean flag = true;

		int min = 0, max = 99;
		int num;
		int count = 1;

		while (flag) {
			count = 1;
			min = 0;
			max = 99;

			System.out.println("���� �����߽��ϴ�. ���߾� ������");
			do {
				System.out.println(min + "-" + max);
				System.out.print(count + ">>");
				num = scan.nextInt();

				if (randNum > num) {
					System.out.println("�� ����");
					min = num;
				} else if (randNum == num) {
					break;
				} else {
					System.out.println("�� ����");
					max = num;
				}

				count++;
			} while (true);

			System.out.print("������ϴ�.\n�ٽ��Ͻðڽ��ϱ�?(y/n)");

			if (scan.next().equals("y")) {
				flag = true;
			} else {
				flag = false;
			}

		}

		scan.close();
	}

}
