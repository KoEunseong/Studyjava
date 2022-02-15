package Conditional;

import java.util.Scanner;

public class NestedSwitchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("주민번호 입력:");
		s = sc.nextLine();
		char gender = s.charAt(7);

		switch(gender) {
			case '1': case '3':
				switch(gender){
					case '1':
						System.out.println("2000년생 이전 남자");
						break;
					case '3':
						System.out.println("2000년생 이후 남자");
				}
				break;
			case '2': case '4':
				switch(gender){
					case '2':
						System.out.println("2000년생 이전 여자");
						break;
					case '4':
						System.out.println("2000년생 이후 여자");
				}
				break;
			default:
				System.out.println("유효x");
			
		}
		
	}
}
