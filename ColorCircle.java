package _10_14;

class Circle{
	int radius;
	public Circle(int radius) {
		this.radius= radius;
	}
	void show() {
		System.out.println("�������� " + radius + "�� ���̴�.");
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
		System.out.println("�� ������ " + radius + "�� " + color + " ���̴�.");
	}
	
}
public class ColorCircle {

	public static void main(String[] args) {
		Circle op = new Circle(5);
		ColoredCircle pp = new ColoredCircle(10, "������");
		
		op.show();
		pp.show();
	}

}
