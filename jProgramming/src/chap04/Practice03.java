package chap04;

/*
 * Practice 03 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice03 {
	public static void main(String[] args) {
		int intArr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double doubleArr[] = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0,
				10.0 };
		
		int switchedDoubleArr[] = ArrayUtility.doubleToInt(doubleArr);
		double switchedIntArr[] = ArrayUtility.intToDouble(intArr);
		
		int i;
		for (i = 0; i < switchedDoubleArr.length; i++) {
			System.out.print(switchedDoubleArr[i] + " ");
		}
		
		System.out.println();
		
		for (i = 0; i < switchedIntArr.length; i++) {
			System.out.print(switchedIntArr[i] + " ");
		}
	}
}
