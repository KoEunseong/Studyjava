package array;

public class ArrayMixEx {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		for(int i = 0;i<10;i++) {
			numArr[i] = i;
			System.out.print(numArr[i]+" ");
		}
		System.out.println();
		int n = 0;
		int tmp = 0;
		for(int i = 0;i<numArr.length;i++) {
			n = (int)(Math.random()*10);
			tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		for(int i = 0;i<10;i++) {
			System.out.print(numArr[i]+" ");
		}
		
		
	}
}
