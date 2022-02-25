package object;
class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4);
	}
	Car(Car c ){ //인스턴스 복사를 위한 생성자
		/*color = c.color;
		gearType = c.gearType;
		door = c.door; 밑에코드와 일치*/
		this(c.color,c.gearType,c.door);
	}
	Car(String color, String geartype , int door){
		this.color = color;
		this.gearType = geartype;
		this.door = door;
	}
}
public class InstanceCopy {
	public static void main(String[] args) {
		Car c1 = new Car("black","manual",6);
		Car c2 = new Car(c1);
		System.out.println(c1.color+ " "+c1.gearType+" "+c1.door);
		System.out.println(c1.color+ " "+c2.gearType+" "+c1.door);
		c1.door = 5;
		System.out.println(c1.color+ " "+c1.gearType+" "+c1.door);
		System.out.println(c1.color+ " "+c2.gearType+" "+c2.door);
		
	
	}
}
