package chap00;

import java.util.Scanner;

public class op0 {
	public static void main(String[] args) {
		Scanner ul = new Scanner(System.in);
		int dq = ul.nextInt();
		
		if(dq==1) {
			System.out.println("���� ���߽��ϴ�.");
		}
		else if(dq>=2 && dq<=3)
		{
			System.out.println("���߽��ϴ�.");
		}
		else if(dq>=4 && dq<=6){
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("����ؾ߰ڽ��ϴ�.");
		}
}
}