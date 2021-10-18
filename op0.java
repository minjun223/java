package chap00;

import java.util.Scanner;

public class op0 {
	public static void main(String[] args) {
		Scanner ul = new Scanner(System.in);
		int dq = ul.nextInt();
		
		if(dq==1) {
			System.out.println("아주 잘했습니다.");
		}
		else if(dq>=2 && dq<=3)
		{
			System.out.println("잘했습니다.");
		}
		else if(dq>=4 && dq<=6){
			System.out.println("보통입니다.");
		}
		else {
			System.out.println("노력해야겠습니다.");
		}
}
}