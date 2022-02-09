package operation;

public class OperatorEx1 {
	public static void main(String[] args) {
		byte a = 50;
		byte b = 10;
		//byte c = a + b; 오류발생! 연산자 +는 두개의 피 연산자들의 자료형을 int로 변환뒤 연산진행함 p92산술변환 참고
		byte c = (byte)(a + b); //피연사즤 타입이 int보다 작은타입이면 int로 변환
		System.out.println((byte)(a*b)); //데이터 손실 발생
		
		byte aa = 127;
		aa++;
		System.out.println(aa); //오버플로 발생 증감연산자는 일반 산술변환에 의한 자동형변환x 타입은 피연산자의 타입동일
		
		
		int d = 1_000_000;
		int f = 2_000_000;
		long l = d * f; //뒤에 연산은 int로 계산되기 때문에 연산결과가 int 따라서 범위초과
		long l2 = (long)d * f;
		System.out.println(l);
		System.out.println(l2);
		
		System.out.println(d * d / d); //오버플로 발생
		System.out.println(d / d * d); //정상적으로 출력
		
	}
}
