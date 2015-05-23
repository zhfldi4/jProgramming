package chap03;

public class Practice10 {
	/*
	 * Practice 10 
	 * 2015.05.23 Sat
	 * Yeonsu Moon
	 */
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			try {
			 	sum += Integer.parseInt(args[i]);
			} catch(Exception e) {
				
			} finally {
				continue;
			}
		}
		
		System.out.print(sum);
	}

}
