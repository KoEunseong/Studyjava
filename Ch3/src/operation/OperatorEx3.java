package operation;

public class OperatorEx3 {
	public static void main(String[] args) {
		char c1 = 'a';
		//char c2 = c1 + 1; 이거는 안되는데
		char c3 = 'a' + 1; //이거는 되는이유?
		/*'a'+1 이 리터럴간의 연산이기 때문이다. 상수 또는 리터럴 간의 연산은 실행과정동안 변하는 값이 아니기 떄문에
		 * 컴파일 시에 컴파일러가 계산해서 그 결과로 대체함으로써 코드를 보다 효율적으로 만든다.p 104참조
		 */
	}
}
