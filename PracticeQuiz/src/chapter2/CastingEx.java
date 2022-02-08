package chapter2;

public class CastingEx {
	public static void main(String[] args) {
			byte b = 10;
			char ch = 'A';
			int i = 100;
			long l = 1000L;
			b = (byte)i;
			ch = (char)b;
			short s = (short)ch;
			float f = l;
			i = ch;
	}
}
