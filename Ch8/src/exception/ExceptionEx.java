package exception;

public class ExceptionEx {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < 10 ; i++) {
			try {
				arr[i] = 10 / (int)(Math.random()*10);
				System.out.println(arr[i]);
			}
			catch(ArithmeticException ae) {
				//ae.printStackTrace();
				System.out.println(ae.getMessage());
			}
		}
	}
}
