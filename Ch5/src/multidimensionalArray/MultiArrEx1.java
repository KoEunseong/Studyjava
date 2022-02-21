package multidimensionalArray;

public class MultiArrEx1 {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100}
			,	{80, 70 ,60}
			,	{60, 40, 80}
			,	{90, 50, 80}
		};
		int sum = 0;
		System.out.println(score.length);
		System.out.println(score[0].length);

		for(int[] arr : score) {
			for(int tmp : arr) {
				System.out.print(tmp + " ");
				sum +=tmp;
			}
			System.out.println();
		}

		System.out.println(sum);
	}
}