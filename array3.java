package chap10;

class MyArray<T>{
	T element;
	void serElement(T element) {this.element=element;}
	T getElement() {return element;}
}
class MadPlay<T>{
	private T vale;
	
	public T getVal() {
		return vale;
	}
	public void setVal(T vale) {
		this.vale=vale;
	}
}
//MyArray<Integer>myArr = new MyArray<Integer>();
public class array3 {

	public static void main(String[] args) {
		MadPlay<String> mp = new MadPlay<>();

	}

}
