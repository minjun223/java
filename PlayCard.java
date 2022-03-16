package test;

class PlayingCard{
	int kind;
	int num;
	static int width = 100;
	static int height = 150;
	PlayingCard(int k, int n){
		kind = k;
		num = n;
	}
}
public class PlayCard {

	public static void main(String[] args) {
		PlayingCard pc = new PlayingCard(1, 5);
		System.out.println("종류:"+pc.kind+"번호:"+pc.num);
		System.out.println("쪽:"+pc.height+"높이:"+pc.width);
	}

}
