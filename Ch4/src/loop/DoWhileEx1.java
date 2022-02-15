package loop;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random() * 100) + 1;
		int b = 0;
		String tmp;
		
		do {
			System.out.print("1~100 입력");
			tmp = sc.nextLine();
			b = Integer.parseInt(tmp);
			if(a > b) {
				System.out.println("up");
			}
			else if(a < b) {
				System.out.println("down");
			}
		}while(a != b);
		System.out.printf("%d %d", a ,b);
	}

}
