package _10_14;

class Girl{
	protected String name;
	void show() {
		System.out.println(name +"�� �ڹ� �ʺ����̴�");
	}
	public Girl(String name) {
		this.name=name;
	}
	public Girl() {
		
	}
	
}
class GoodGirl extends Girl{
	
	public GoodGirl(String name){
		this.name = name;
	}
	void show() {
		System.out.println(name +"�� �ڹٸ� �߾ȴ�");
	}
	public GoodGirl() {
		
	}
}

class BestGirl extends GoodGirl{
	
	public BestGirl(String name){
		this.name = name;
	}
	void show() {
		System.out.println(name + "�ڹٸ� �����ϰ� �� �ȴ�");
	}
	public BestGirl() {
		
	}
}
public class GirlTest3 {

	public static void main(String[] args) {
		Girl[] girls = {new Girl("������"), new GoodGirl("����"), new BestGirl("Ȳ����")};
		
		for(Girl g: girls)
			g.show();
	}
}