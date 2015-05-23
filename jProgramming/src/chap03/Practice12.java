package chap03;
/*
 * Practice 12 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice12 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			if ((i / 10) % 3 == 0 && (i / 10) != 0)
				count++;
			if ((i - (i / 10) * 10) % 3 == 0 && ((i - (i / 10) * 10) != 0)) 
				count++;
			
			if (count != 0)
				System.out.println(i + " ¹Ú¼ö " + count + " ¹ø");
			
			count = 0;
		}
		
		
		
	}

}
