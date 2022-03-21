package polymorphism;
class Parent{
	int x = 100;
	void method() {
		System.out.println("부모");
	}
}

class Child extends Parent{
	int x = 200; //중복정의
	@Override
	void method() {
		System.out.println(x); //this.x 와 일치
		System.out.println(super.x);
		System.out.println(this.x);
	}
	
}
public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		p.method();
		System.out.println();
		c.method();
	}
}
