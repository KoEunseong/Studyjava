package operation;

public class OperatorEx5 {
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.println(10.0 == 10.0f);
		System.out.println(0.1 == 0.1f);
		System.out.printf("f = %19.17f\n", f);
		System.out.printf("d = %19.17f\n", d);
		System.out.printf("d2 = %19.17f\n", d2);
		
		
		System.out.println(d2);
		
	}
}
