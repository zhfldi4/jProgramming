package chap04;

/*
 * Practice 01 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Practice01 {
	public static void main(String[] args) {
		String composer[] = {"Abba"};
		Song abba = new Song("Dancing Queen", "ABBA", "ABBA", composer, 1991, 10);
		
		abba.show();
	}
}
