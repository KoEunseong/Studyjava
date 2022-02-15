package Conditional;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		String myCard;
		String yourCard;
		Scanner sc = new Scanner(System.in);
		
		double d = Math.random();
		int yourIntValue = (int)(d*3) + 1;
		int myIntValue;
		int intResult;
		String result;
		switch(yourIntValue) {
			case 1:
				yourCard = "가위";
				break;
			case 2:
				yourCard = "바위";
				break;
			default:
				yourCard = "보";
				break;
		}
		
		System.out.print("가위 바위 보 중 하나를 입력하시오:");
		myCard = sc.nextLine();
		switch(myCard) {
		case "가위":
			myIntValue = 1;
			break;
		case "바위":
			myIntValue = 2;
			break;
		case "보":
			myIntValue = 3;
			break;
		default:
			myIntValue = -1;
	}
	
		if(myIntValue == -1) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		intResult =  myIntValue - yourIntValue;
		switch(intResult) {
			case -2: case 1: 
				result = "win";
				break;
			case 2: case -1:
				result = "lose";
				break;
			default:
				result = "draw";
		}
		
		
		
		System.out.printf("\n내 카드: %s %d \n",myCard,myIntValue);
		System.out.printf("상대방 카드: %s %d \n",yourCard,yourIntValue);
		System.out.println(result);
		
		
		
	}
}
