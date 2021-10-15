package chap00;

import java.util.Scanner;

public class op1 {

	public static void main(String[] args) {
		Scanner ij = new Scanner(System.in);
		
		int sum=0, j=0;
		do {
			System.out.println("양의 정수를 입력하세요");
			int i = ij.nextInt();
			if(i%2==0) {
				sum+=i;
			}
			j+=1;
		}while(j<5);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
	}

}
