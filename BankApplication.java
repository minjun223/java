package test;

class Account{
	private String ano;
	private String owner;
	private int balance;
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	void print() {
		System.out.println(ano + owner + balance);
	}
	void transfer(Account target, int amount) {
		if(balance < amount) {
			System.out.println("ÀÜ¾×ÀÌ ¾ø½À´Ï´Ù.");
		}
		else {
			balance-=amount;
			target.balance += amount;
		}	
	}
}
public class BankApplication {

	public static void main(String[] args) {
		Account a = new Account("123-45 ", "±èÃ¶¼ö ", 10000);
		Account b = new Account("567-89 ", "¹Ú¿µÈñ ", 10000);

		a.print();
		b.print();
		
		
		System.out.println("°èÀÚ ¼Û±Ý ÈÄ");
		
		a.transfer(b, 3000);
		
		a.print();
		b.print();
		
	}

}