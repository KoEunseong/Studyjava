package object2;
class Cart{
	int a = 5;
}

class CCart extends Cart{
	int b = 51;
}
public class Test {
	public static void main(String[] args) {
		Cart c = new CCart();
	}
}
