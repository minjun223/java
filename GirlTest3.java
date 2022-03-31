package _10_14;

class Girl{
	protected String name;
	void show() {
		System.out.println(name +"는 자바 초보자이다");
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
		System.out.println(name +"는 자바를 잘안다");
	}
	public GoodGirl() {
		
	}
}

class BestGirl extends GoodGirl{
	
	public BestGirl(String name){
		this.name = name;
	}
	void show() {
		System.out.println(name + "자바를 무지하게 잘 안다");
	}
	public BestGirl() {
		
	}
}
public class GirlTest3 {

	public static void main(String[] args) {
		Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};
		
		for(Girl g: girls)
			g.show();
	}
}