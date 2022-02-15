package loop;

import java.util.Scanner;

public class NestedLoopEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력");
		String s = sc.nextLine();
		int num = Integer.parseInt(s);
		for(int i = 1;i<=num;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
