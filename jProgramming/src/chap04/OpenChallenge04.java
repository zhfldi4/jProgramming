package chap04;

import java.util.Scanner;

/*
 * OpenChalleng 04 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class OpenChallenge04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		System.out.print("���ӿ� �����ϴ� �ο��� �� ���Դϱ�??");
		num = scan.nextInt();

		Player player[] = new Player[num];

		for (int i = 0; i < player.length; i++) {
			player[i] = new Player();
		}

		String word = "�ƹ���";
		String answer = "";

		boolean flag = true;

		System.out.println("���� �ܾ�� �ƹ��� �Դϴ�.");

		while (true) {

			for (int i = 0; i < player.length; i++) {
				System.out.print(player[i].name + ">>");
				answer = player[i].sayWord();
				flag = player[i].succeed(word, answer);

				if (flag) {
					System.out.println(player[i].name + " ���� �����ϴ�.");

					scan.close();
					System.exit(0);
				}

				word = answer;
			}

		}

	}
}
