package chapter2;

public class LiteralTest {
	public static void main(String[] args) {
		int i = 'c';
		byte b = 123; //byte,short는 리터럴이 따로 존재하지않으므로 범위를 넘지않는 선에서 int타입의 리터럴 사용
		//byte c = 129;
		float f = 0.0f;
		//float fx = 0.0;
		/*리터럴의 타입은 저장될 변수의 타입과 일치하는 것이 보통이지만 타입이 달라도 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는
		 * 것은 허용된다.*/
		b = (byte)i;
		long l  = 50L;
		f = l;
		
		
		
		
	}
}
