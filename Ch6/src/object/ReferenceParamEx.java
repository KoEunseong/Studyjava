package object;
class Date{
	int x;
	}

public class ReferenceParamEx {
	static void change(Date d) {
		d.x = 1000;
		System.out.println("change():"+ d.x);
	}

	public static void main(String[] args) { //p265
		Date d = new Date();
		d.x = 500;
		System.out.println("main():"+d.x);
		change(d);
		System.out.println("main():"+d.x);
	//참조형으로 매개변수를 선언하면 값이 저장된 곳의 주소를 알 수 있기 때문에 값을 읽어 오는 것은 물론 값을 변경하는 것도 가능하다.
	
	}
}
