package operation;

public class OperatorEx7 {
	public static void main(String[] args) {
		byte p = 10;
		byte n = -10;
		System.out.println(toBinaryString(p));
		n -= 1;
		System.out.println(toBinaryString(~n));
		
	}
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}


}

