package pratice;

import java.io.PrintStream;

class Car{
	public Car(String string) {
		
	}
	static int getNumOfCar() {
		
		return 0;
		
	}
	public static Object getNumOfRedCar() {
		
		return null;
	}
}
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("�ڵ��� �� : %d, ������ �ڵ��� ��: %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}

}
