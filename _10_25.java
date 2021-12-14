package chap07;

interface Controllable{
	void turnOn();
	void turnOff();
	
	default void repair() {
		System.out.println("��� �����Ѵ�.");
	}
	static void reset() {
		System.out.println("��� �ʱ�ȭ");
	}
}

class Tv implements Controllable{
	@Override
	public void repair() {
		Controllable.super.repair();
	}
	@Override
	public void turnOn() {
		System.out.println("Tv �� Ų��");
	}
	@Override
	public void turnOff() {
		System.out.println("Tv �� ����");
	}

}
class Computer implements Controllable{
	@Override
	public void repair() {
		Controllable.super.repair();
	}
	@Override
	public void turnOn() {
		System.out.println("��ǻ�͸� Ų��");
	}
	@Override
	public void turnOff() {
		System.out.println("��ǻ�͸� ����");
	}
	
}
public class _10_25 {

	public static void main(String[] args) {
		Controllable[] controllable = {new Tv(),new Computer()};
		
		for(Controllable c:controllable){
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllable.reset();
	}	
}
