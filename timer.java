package test1;

import java.util.Scanner;

public class timer {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분입력");
		int min = sc.nextInt();
		int sec = min * 60;
		
		for(int i = sec; i>=0; i--) {
			System.out.println(i/60 + "분" + i%60 + "초");
			Thread.sleep(1000);
		}
		System.out.println("타이머 끝");

	}
}
