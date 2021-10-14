package chap00;

import java.util.Scanner;

public class op {

	public static void main(String[] args) {
	Scanner uh = new Scanner(System.in);
	int dw = uh.nextInt();
	
	if(dw>=19) {
		System.out.println("성년");
	}
	else {
		System.out.println("미성년");
	}
	
}
}
