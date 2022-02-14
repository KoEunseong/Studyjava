package operation;

public class OperatorEx8 {
	public static void main(String[] args) {
		int dec = 1234;
		int hex = 0xABCD; //43981
		int mask = 0xF; //15
		System.out.printf("%X \n",hex);
		System.out.printf("%X \n",hex & mask);
		hex = hex>>4;
		System.out.printf("%X \n",hex);
		System.out.printf("%X \n",hex & mask);
		
		hex = hex>>4;
		System.out.printf("%X \n",hex);
		System.out.printf("%X \n",hex & mask);
		
		hex = hex>>4;
		System.out.printf("%X \n",hex);
		System.out.printf("%X \n",hex & mask);
		
		
		
		
		
	}
}
