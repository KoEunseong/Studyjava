package object;

public class CallStackTest {
	static void firstMethod() {
		System.out.println("first 메소드 시작");
		secondMethod();
		System.out.println("first 메소드 종료");
		
	}
	static void secondMethod() {
		System.out.println("second 메소드 시작");
		System.out.println("second 메소드 종료");
		
	}
	
	
	public static void main(String[] args) { //p263
		System.out.println("main 메소드 시작");
		CallStackTest.firstMethod();
		System.out.println("main 메소드 종료");
	}
	
	
}
