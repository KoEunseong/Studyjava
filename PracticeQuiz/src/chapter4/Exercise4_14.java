package chapter4;

public class Exercise4_14 {
		public static void main(String[] args){
		// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		int answer =(int)(Math.random()*100) + 1/* (1) */;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
		count++;
		System.out.print("1 100 :과 사이의 값을 입력하세요"); 
		input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다
		if(answer > input) {
			System.out.println("더 큰 값을 입력하시오.");
		}
		else if(answer< input) {
			System.out.println("더 작은 값 입력하시오.");
		}
		else {
				System.out.println("맞춤\n시도횟수:"+count);
				break;
			}
		} while(true); // 무한반복문
		} // end of main
}
