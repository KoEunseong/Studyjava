package polymorphism;
class Son extends Parents{
	void a(){
		System.out.println('a');
	}
}
class Parents{
	
}
public class CastingTest2 {
	public static void main(String[] args) {
		Parents p1 = new Parents();
		Parents p2 = null;
		Son s1 = null;
		Son s2 = new Son();
		
		//s1 = (Son)p1; 실행 시 에러발생 : 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는것은 허용되지 않는다.
		p2 = s2;
		s1 = (Son)p2;
		s1.a();
	}
}
