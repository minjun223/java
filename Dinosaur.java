package chap07;



interface Dinosau {
	public abstract void cry();
}
class T_rex implements Dinosau{
	public void walk() {
		System.out.println("걷기");
	}
	public void cry() {
		System.out.println("울기");
	}
}
class Ptera implements Dinosau{
	public void fly() {
		System.out.println("날기");
	}
	public void cry() {
		System.out.println("울기");
	}
}
public class Dinosaur {
	public static void main(String[] args) {
//		Dinosau[] d = {new T_rex(), new Ptera()};
		T_rex t = new T_rex();
		Ptera P = new Ptera();
		t.cry();
		t.walk();
		P.cry();
		P.fly();
	}
}