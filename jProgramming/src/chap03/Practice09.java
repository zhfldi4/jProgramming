package chap03;

/*
 * Practice 09 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice09 {
	public static void main(String[] args) {
		int avg = 0;
		
		for (int i = 0; i < args.length; i++) {
			avg += Integer.parseInt(args[i]);
		}
		
		avg /= args.length;
		
		System.out.print(avg);
	}

}
