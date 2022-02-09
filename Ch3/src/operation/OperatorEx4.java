package operation;

public class OperatorEx4 {
	public static void main(String[] args) {
		char a = 'a';
		for(int i = 0;i<26;i++) {
			System.out.print(a++);
		}
		System.out.println();
		
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000) / 1000.0;
		System.out.println(shortPi);
		
	}
}
