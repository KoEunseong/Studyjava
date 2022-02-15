package loop;

import java.util.Scanner;

public class LoopEx1 {
	public static void main(String[] args) {
		String s;
		int num = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오:");
		s = sc.nextLine();
		num = Integer.parseInt(s);
		int a;
		while(num !=0) {
			sum += num %10;
			num /= 10;
		}
		System.out.println(sum);
		
	}
}
