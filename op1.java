package chap00;

import java.util.Scanner;

public class op1 {

	public static void main(String[] args) {
		Scanner ij = new Scanner(System.in);
		
		int sum=0, j=0;
		do {
			System.out.println("���� ������ �Է��ϼ���");
			int i = ij.nextInt();
			if(i%2==0) {
				sum+=i;
			}
			j+=1;
		}while(j<5);
		System.out.println("�Է��� ���� ���� �߿��� ¦���� ���� " + sum);
	}

}
