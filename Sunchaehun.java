package chap07;
//����� �������̽�
interface Wearable2 {
 void putOn();   // �Ա�
 void putOff();  // ����
}

//��ĥ �������̽�
interface Colorable {
 int RED = 1;    // ����
 int GREEN = 2;  // �ʷ�
 int BLUE = 3;   // �Ķ�
}

abstract class WearableRobot implements Wearable2, Colorable {
 private int color;  // ��
 WearableRobot(int color) {changeColor(color);}
  public void changeColor(int color) {this.color=color;}
  public String toString()  {
    switch (color) {
    case RED : return "���� �κ�";
    case GREEN : return "�ʷ� �κ�";
    case BLUE : return "�Ķ� �κ�";
     }
     return "�κ�";
 }
 public void putOn() {
     System.out.println(toString()+" ����!!");
 }
 public void putOff() {
     System.out.println(toString()+" ����!!");
 }
}

class WearableRobotTest extends WearableRobot {

	WearableRobotTest(int color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
}

public class Sunchaehun {

	public static void main(String[] args) {
		WearableRobot r = new WearableRobotTest(1);
		r.putOn();
		r.putOff();
	}

}
