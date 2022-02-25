package object;
class a{
	int x;
	int y = x;
	a(int x, int y){
		this.x = x;
		this.y = y;
	}
	a(int x){
		this.x = x;
	}
}
public class Test {
	public static void main(String[] args) {
		a c1 = new a(1);
		a c2 = new a(1,2);
		System.out.println(c1.y);
		System.out.println(c2.y);
		
	}
}
