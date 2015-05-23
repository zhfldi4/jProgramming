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

			System.out.println("수를 결정했습니다. 맞추어 보세요");
			do {
				System.out.println(min + "-" + max);
				System.out.print(count + ">>");
				num = scan.nextInt();

				if (randNum > num) {
					System.out.println("더 높게");
					min = num;
				} else if (randNum == num) {
					break;
				} else {
					System.out.println("더 낮게");
					max = num;
				}

				count++;
			} while (true);

			System.out.print("맞췄습니다.\n다시하시겠습니까?(y/n)");

			if (scan.next().equals("y")) {
				flag = true;
			} else {
				flag = false;
			}

		}

		scan.close();
	}

}
