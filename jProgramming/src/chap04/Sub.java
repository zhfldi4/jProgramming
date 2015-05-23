package chap04;

/*
 * Sub Class 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Sub {
	int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a - b;
	}
}
