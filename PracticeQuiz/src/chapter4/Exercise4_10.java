package chapter4;

public class Exercise4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int i = 10;
		while(true) {
			sum +=num % i;
			num /= 10;
			
			if(num == 0) break;
		}
		System.out.println("sum="+sum);

	}
}
