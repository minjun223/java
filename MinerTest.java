package test;

public class MinerTest {

	public static void main(String[] args) {
		
		Miner n1 = new Miner("����");
		Miner n2 = new Miner("�۷θ���");
		
		n1.mine(3);
		n2.mine(2);
		
		n1.print();
		n2.print();
	}

}
class Miner{
	int coins;
	String name;
	
	public Miner(String name) {
		this.name = name;
	}
	
	public void mine(int n) {
		this.coins = n;
	}
	
	public void print() {
		System.out.println("name : "+ name + " coins : " + coins);
	}
}