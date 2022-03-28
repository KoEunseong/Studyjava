package exception;

public class MathException {
	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("test");
			throw e;
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
