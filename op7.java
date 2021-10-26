package chap00;

import java.util.Scanner;

public class op7 {

	Scanner tg = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		if(isPrime(num)==0) {
			System.out.println(num + "는 소수입니다.");
		}
		else
			System.out.println(num + "는 소수가 아닙니다.");
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
