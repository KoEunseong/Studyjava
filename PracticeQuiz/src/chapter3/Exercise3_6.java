package chapter3;

public class Exercise3_6 {
	public static void main(String[] args) {
		int num = 24;
		System.out.println(num % 10 == 0? num: (num+ (10 - num % 10)));
	}
}
