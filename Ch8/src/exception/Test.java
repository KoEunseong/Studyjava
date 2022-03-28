package exception;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
