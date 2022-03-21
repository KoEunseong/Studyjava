package polymorphism;
class Car {
	String color;
	int door;
	void drive() {
		System.out.println("drive");
	}
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water");
	}
}
public class CastingTest1 {
	public static void main(String[] args) {
		Car c = null;
		
		FireEngine f1 = new FireEngine();
		FireEngine f2 = null;
		
		f1.water();
		c = f1;
		//c.water();
		f2 = (FireEngine)c;
		f2.water();
	
	}
}
