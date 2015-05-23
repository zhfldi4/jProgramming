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
		System.out.print("게임에 참여하는 인원은 몇 명입니까??");
		num = scan.nextInt();

		Player player[] = new Player[num];

		for (int i = 0; i < player.length; i++) {
			player[i] = new Player();
		}

		String word = "아버지";
		String answer = "";

		boolean flag = true;

		System.out.println("시작 단어는 아버지 입니다.");

		while (true) {

			for (int i = 0; i < player.length; i++) {
				System.out.print(player[i].name + ">>");
				answer = player[i].sayWord();
				flag = player[i].succeed(word, answer);

				if (flag) {
					System.out.println(player[i].name + " 님이 졌습니다.");

					scan.close();
					System.exit(0);
				}

				word = answer;
			}

		}

	}
}
