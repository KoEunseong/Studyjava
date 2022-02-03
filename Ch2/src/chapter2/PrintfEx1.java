package chapter2;

public class PrintfEx1 {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int i = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; //8진수 10 , 10진수로 8
		int hexNum = 0x10; //16진수 10, 10진수로 16
		int binNum = 0b10; //2진수  10 , 10진수로 2
		
		
		System.out.printf("i = %05d \n", i);
		System.out.printf("%#x %d %n", hexNum,hexNum);
		System.out.printf("%s %d",Integer.toBinaryString(binNum),binNum);
		///aaA
	}
}
