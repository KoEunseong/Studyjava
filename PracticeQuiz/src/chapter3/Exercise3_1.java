package chapter3;

public class Exercise3_1 {
		public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 의 문자코드는
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c); //이항연산자는 피연산자가 보다 작은 타입 인 경우 int로 변환한 다음에 연산을 수행한다
		System.out.println('5'-'0');
		System.out.println(c+1); //char와 int가 만나서 int로 형변환 
		System.out.println(++c);// 단항연산자인 은 이항연산자와 달리 보다 작은 타입도 형변환을 하지않는다
		System.out.println(c++);
		System.out.println(c);
		}

}
