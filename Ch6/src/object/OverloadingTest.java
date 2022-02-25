package object;

public class OverloadingTest {
	int  add(int a , int b) {
		System.out.println("1번 메소드");
		return a + b;
	}
	long add(int a , long b ) {
		System.out.println("2번 메소드");
		return a + b;
	}
	long add(long a, int b) {
		System.out.println("3번 메소드");
		return a+b;
	}
	long add(long a, long b) {
		System.out.println("4번 메소드");
		return a+b;
	}
	public static void main(String[] args) {
		
		System.out.println("println 실행 : " + new OverloadingTest().add(1, 2));
		
	}
}
