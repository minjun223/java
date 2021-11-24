package chap07;
abstract class Human{
	public abstract void sleep();
	public abstract void say();
}

class Minjun extends Human{
	@Override
	public void sleep() {
		System.out.println("Zzz");
	}
	@Override
	public void say() {
		System.out.println("Hello");
	}
}
public class Ex_01 {

	public static void main(String[] args) {
		Minjun n = new Minjun();
		n.say();
		n.sleep();
	}

}
