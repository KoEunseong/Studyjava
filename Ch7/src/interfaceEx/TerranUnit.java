package interfaceEx;
class Unit {
	int hitPoint; //현재 체력
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
	public int getHitPoint() {
		return hitPoint;
	}
	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}
}
class GroundedUnit extends Unit{
	GroundedUnit(int hp) {
		super(hp);
	}
}
class AirUnit extends Unit{
	AirUnit(int hp) {
		super(hp);
	}
}
class Tank extends GroundedUnit implements Repairable{
	
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}
}
class SCV extends GroundedUnit implements Repairable{
	
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "SCV";
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r; //unit클래스에 정의된 멤버들 사용하려고
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println( u.toString() + "의 수리 끝");
		}
	}
}
class Dropship extends AirUnit implements Repairable{
	
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Dropship";
	}
}
class Marine extends GroundedUnit{
	
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine";
	}
}
interface Repairable {}
public class TerranUnit {
	public static void main(String[] args) {
		Marine m = new Marine();
		SCV s = new SCV();
		Tank t = new Tank();
		//s.repair(m);
		t.hitPoint -= 50;
		System.out.println(t.hitPoint);
		s.repair(t);
		System.out.println(t.hitPoint);
		
	}
}
