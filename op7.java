package chap00;

import java.util.Scanner;

public class op7 {

	Scanner tg = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("���� ������ �Է��ϼ��� : ");
		int num = new Scanner(System.in).nextInt();
		if(isPrime(num)==0) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		}
		else
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
	}
	private static int isPrime(int num) {
		int i,is=0;
		for(i=2; i<num; i++)
		{
			if(num%i==0)
			{
				is=1;
				break;
			}
		}
		return is;
	}

}
