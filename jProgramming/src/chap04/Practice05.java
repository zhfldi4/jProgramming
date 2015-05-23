package chap04;

import java.util.Scanner;

/*
 * Practice 05 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;
		String operator;

		System.out.print("두 수와 연산자를 입력하시오");
		a = scan.nextInt();
		b = scan.nextInt();
		operator = scan.next();


		switch (operator) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
			
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
			
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
			
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
			
		}

		scan.close();
	}
}
