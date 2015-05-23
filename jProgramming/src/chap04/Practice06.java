package chap04;

import java.util.Scanner;

/*
* Practice 06 
* 2015.05.23 Sat
* Yeonsu Moon
*/
public class Practice06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Reservation revService = new Reservation();

		int num;
		String name;
		int seatNumber;

		while (true) {
			System.out.print("예약(1) 조회(2) 취소(3) 끝내기(4)>>>");
			num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.print("좌석 구분S(1) A(2) B(3)>>>");
				num = scan.nextInt();
				revService.showSeat(num);
				System.out.print("이름:");
				name = scan.next();
				System.out.print("번호:");
				seatNumber = scan.nextInt();

				revService.reserve(num, name, seatNumber);

				break;

			case 2:
				revService.showSeat(1);
				revService.showSeat(2);
				revService.showSeat(3);
				break;

			case 3:
				System.out.print("좌석 구분S(1) A(2) B(3)>>>");
				num = scan.nextInt();
				revService.showSeat(num);
				System.out.print("이름:");
				name = scan.next();

				revService.cancel(num, name);

				break;
			case 4:
				scan.close();
				System.exit(0);
			}

		}

	}

}
