package chap04;

/*
 * Reservation Class 
 * 2015.05.23 Sat
 * Yeonsu Moon
 * 
 * Properties : 
 * 	String sSeat[]
 *  String aSeat[]
 *  String bSeat[]
 *  
 * Methods :
 * 	reserve(int seatCase, String name, int seatNumber)
 * 	cancel(int seatCase, String name)
 *  showSeat(int seatCase)
 */
public class Reservation {
	String sSeat[];
	String aSeat[];
	String bSeat[];

	public Reservation() {
		sSeat = new String[10];
		aSeat = new String[15];
		bSeat = new String[20];

		int i;
		for (i = 0; i < sSeat.length; i++) {
			sSeat[i] = "---";
			aSeat[i] = "---";
			if (i < 5) {
				aSeat[i + 10] = "---";
			}
			bSeat[i] = "---";
			if (i < 10) {
				bSeat[i + 10] = "---";
			}
		}
	}

	public void reserve(int seatCase, String name, int seatNumber) {
		seatNumber--;
		
		switch (seatCase) {
		case 1:
			sSeat[seatNumber] = name;
			break;

		case 2:
			aSeat[seatNumber] = name;
			break;

		case 3:
			bSeat[seatNumber] = name;
			break;

		default:
		}
	}

	public void cancel(int seatCase, String name) {
		int i;

		switch (seatCase) {
		case 1:
			for (i = 0; i < sSeat.length; i++) {
				if (sSeat[i].equals(name)) {
					sSeat[i] = "---";
					break;
				}
			}
			break;

		case 2:
			for (i = 0; i < aSeat.length; i++) {
				if (aSeat[i].equals(name)) {
					aSeat[i] = "---";
					break;
				}
			}
			break;

		case 3:
			for (i = 0; i < bSeat.length; i++) {
				if (bSeat[i].equals(name)) {
					bSeat[i] = "---";
					break;
				}
			}
			break;

		default:
		}
	}

	public void showSeat(int seatCase) {
		int i;

		switch (seatCase) {
		case 1:
			System.out.print("S>> ");
			for (i = 0; i < sSeat.length; i++) {
				System.out.print(sSeat[i] + " ");
			}
			System.out.println();
			break;
		case 2:
			System.out.print("A>> ");
			for (i = 0; i < aSeat.length; i++) {
				System.out.print(aSeat[i] + " ");
			}
			System.out.println();
			break;
		case 3:
			System.out.print("B>> ");
			for (i = 0; i < bSeat.length; i++) {
				System.out.print(bSeat[i] + " ");
			}
			System.out.println();
			break;

		}
	}
}
