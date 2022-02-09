package operation;

public class OperatorEx2 {
	public static void main(String[] args) {
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		System.out.printf("%d %n",d-a);
		System.out.printf("%d %n",two-zero);
		
		
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';
		int i = c1 + 1;
		c3 = (char)(c1 + 1); //c1+1의 연산결과가 int이므로 char로 형변환 해줘야함
		c2++; //c2 = c2+ 1은 에러발생
		System.out.println(c2);
	}
}
