package test;

public class MinerTest {

	public static void main(String[] args) {
		
		Miner n1 = new Miner("말런");
		Miner n2 = new Miner("글로리아");
		
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