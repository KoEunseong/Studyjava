package object2;
class Tv{
	boolean a;
	int b = 5;
	void power() {
		System.out.println("parent");
	}
	
}
class VCTV extends Tv{
	boolean a;
	//int b = 6;
	void power() {
		System.out.println("son");
	}
}
public class TvEx {
	public static void main(String[] args) {
		VCTV c = new VCTV();
		System.out.println(c.b);
		c.power();
	}
}
