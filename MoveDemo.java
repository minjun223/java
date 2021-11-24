package chap07;

interface mov{
	
	void move(int x);

}

class Car implements mov{
	private int pos=0;
	
	public void move(int x) {
		pos+=x;
	}
	
	public void show() {
		System.out.println(pos + "이동했습니다.");
	}
}
public class MoveDemo {
	public static void main(String[] args) {
		mov m = new Car();
		m.move(10);
		
		Car c = (Car) m;
		c.move(5);
		c.show();
	}
}
