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
		System.out.println("����:"+pc.kind+"��ȣ:"+pc.num);
		System.out.println("��:"+pc.height+"����:"+pc.width);
	}

}
