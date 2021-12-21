package chap04;

public class Phonedemo {

	public static void main(String[] args) {
		phone ap = new phone();
		ap.model = "갤럭시S8";
		ap.value = 100;
		ap.print();
		
		phone ad = new phone();
		ad.model ="아이폰10";
		ad.value = 200;
		ad.print();
	}

}
