package chap07;

interface Coin{
	int PENNY =1, NICKEL =5, DIME =10, QUARTER= 25;
}
public class Money implements Coin{

	public static void main(String[] args) {
		System.out.println("Dime은 "  + DIME + "입니다.");
		
	}

}
