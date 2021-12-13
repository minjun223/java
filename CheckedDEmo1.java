package chap10;

public class CheckedDEmo1 {

	public static void main(String[] args) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ttt");
	}

}
