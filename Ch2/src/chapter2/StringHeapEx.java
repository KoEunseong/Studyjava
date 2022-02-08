package chapter2;

public class StringHeapEx {
	public static void main(String[] args) {
		String a = "aa";
		String b = "aa";
		String c = new String("aa");
		
		//a = "qq";
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
		
	}
}
