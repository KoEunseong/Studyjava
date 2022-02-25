package object;
class Calculator{
	int add(int x, int y) {
		return x + y;
	}
	double getAverage(int x, int y) {
		System.out.println(getAverage2(x, y)); //인스턴스 메서드에서 static메서드는 사용가능
		return add(x,y)/2.0;
		
	}
	static double getAverage2(int x, int y) {
		//return add(x,y) *2;   
		return (x + y)/2.0;
		/*static 메소드의 경우 인스턴스가 생성되지 않아도 사용할 수 있다. 반면 인스턴스 변수나 메서드의 경우
		 인스턴스가 생성되야 사용할 수 있기 때문에 static메서드가 호출되었을 때 인스턴스가 생성이 안돼있으면 인스턴스 메서드를
		 사용하지 못하는 문제가 생길수 있음
		 따라서  static 메소드는  같은 클래스 내의 인스턴스 메서드를 호출할 수 없다.*/
	}
	
}



public class MethodEx {
	static void runas() {
		System.out.println("a");
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		double a = c.getAverage(2, 3);
		System.out.println(a);
		runas();
	}
}
