package chap04;

/*
 * Rectangle Class 
 * 2015.05.23 Sat
 * Yeonsu Moon
 */
public class Rectangle {
	int x1;
	int y1;
	int x2;
	int y2;

	public Rectangle() {

	}

	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int square() {
		return (x1 - x2) * (y1 - y2);
	}

	public void show() {
		System.out.println("ÁÂÇ¥: (" + x1 + ", " + y1 + ") (" + x2 + ", " + y2
				+ ")");
		System.out.println("»ç°¢Çü ³ÐÀÌ: " + this.square());
	}

	public boolean equals(Rectangle r) {
		if (this.square() == r.square())
			return true;
		return false;
	}

}
