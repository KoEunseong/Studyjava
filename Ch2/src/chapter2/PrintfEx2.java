package chapter2;

public class PrintfEx2 {
	public static void main(String[] args) {
		float a = 3.14f;
		float b = 3.1e1f;
		double c = 1.23456789;
		String s = "hello world";
		System.out.printf("%f %e %g \n",a,a,a);
		System.out.printf("%014.10f \n",c);
		System.out.printf("%.5s",s);
	}
}
