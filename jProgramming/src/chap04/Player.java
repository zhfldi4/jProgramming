package chap04;

import java.util.Scanner;

/*
 * Song Class 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Player {
	String name;
	String word;

	Scanner scan;

	public Player() {
		scan = new Scanner(System.in);

		System.out.print("참가자의 이름을 입력하세요");
		this.name = scan.next();

		word = "";

	}

	public String sayWord() {
		word = scan.next();

		return word;
	}

	public boolean succeed(String word, String answer) {
		int lastIndex = word.length() - 1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = answer.charAt(0);

		if (lastChar == firstChar)
			return false;
		else
			return true;
	}

}
