package _10_14;

class Circle{
	int radius;
	public Circle(int radius) {
		this.radius= radius;
	}
	void show() {
		System.out.println("반지름이 " + radius + "인 원이다.");
	}
}
class ColoredCircle{
	int radius;
	String color;
	public ColoredCircle(int radius, String color) {
		this.color = color;
		this.radius = radius;
	}
	void show() {
		System.out.println("반 지름이 " + radius + "인 " + color + " 원이다.");
	}
	
}
public class ColorCircle {

	public static void main(String[] args) {
		Circle op = new Circle(5);
		ColoredCircle pp = new ColoredCircle(10, "빨간색");
		
		op.show();
		pp.show();
	}

}
