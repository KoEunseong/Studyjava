package chapter4;

public class Exercise4_6 {
	public static void main(String[] args) {
	
	int dice1;
	int dice2;
	
		for(dice1 = 1;dice1 <=6 ;dice1++) {
			for(dice2 = 1; dice2 <=6; dice2++) {
				if(dice1+dice2 == 6) {
					System.out.printf("(%d,%d)\n",dice1,dice2);
				}
			}
		}
	}
}
