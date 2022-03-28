package exception;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			System.out.println(0/0);
		}
		catch(ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
	}
}
