package chapter2;

public class OverflowEx {
	public static void main(String[] args) {
		short a = 32767;
		short b = -32768;
		
		System.out.println((short)(a + 1));
	}
}
