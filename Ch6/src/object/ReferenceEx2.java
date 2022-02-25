package object;

public class ReferenceEx2 {
	static void print(int[] arr) {
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	static void sort(int[] arr) {
		for(int i = 0;i<arr.length -1;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1] ) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,1,6,5,4};
		print(arr);
		sort(arr);
		print(arr);
		 
	}
}
