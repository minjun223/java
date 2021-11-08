package chap02;

import java.util.Scanner;

public class EX_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch='a';
		do {
			System.out.println(ch);
			ch+=1;
		}while(ch<='z');
		//System.out.println(ch);
	}

}
