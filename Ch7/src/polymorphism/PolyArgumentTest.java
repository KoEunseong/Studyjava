package polymorphism;

import java.util.Vector;
class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price * 0.1);
	}
}
class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Radio extends Product{
	Radio(){
		super(50);
	}
	public String toString() {
		return "Radio";
	}
}
class Buyer{
	int money;
	int bonusPoint = 0;
	Vector item = new Vector();
	Buyer(int money){
		this.money = money;
	}
	void buy(Product p) {
		money -= p.price;
		bonusPoint +=p.bonusPoint;
		item.add(p);
		System.out.println(p + "구입");
	}
	void show() {
		for(int i = 0;i<item.size();i++) {
			System.out.println(item.get(i));
		}
	}
}
public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		b.buy(new Tv());
		b.buy(new Radio());
		Radio r = new Radio();
		b.buy(r);
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		System.out.println("-----------------");
		b.show();
		b.item.remove(r);
		System.out.println("-----------------");
		b.show();
		
	}
}
