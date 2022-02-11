package operation;

import java.util.Scanner;

public class OperatorEx6 {
	public static void main(String[] args) {
		char c = ' ';
		String s;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자하나를 입력하시오:");
			s = sc.nextLine();
			
			if(s.length() > 1 ||s.length() ==0) {
				System.out.println("Warning! 문자 '하나'만 입력하시오");
				continue;
			}
			c = s.charAt(0);
			if('0' <= c && c <= '9') {
				System.out.println("입력하신문자는 숫자입니다.");
				break;
			}
			else if(('a' <= c && c <='z') || ('A' <= c && c <='Z')) {
				System.out.println("입력하신 문자는 영문입니다.");
				break;
			}
			else {
				System.out.println("입력하신 문자는 등등 입니다.");
				break;
			}
		
		
		
		}
		
		
	}
}
