package chap00;

public class op6 {

	public static void main(String[] args) {
		foo("�ȳ� ", 1);
		foo("�ȳ��ϼ��� ", 1, 2);
		foo("�� �־�");
	
	}
	public static void foo(String string, int a) {
		System.out.println(string +  a);
		
	}
	public static void foo(String string, int a, int v) {
		System.out.println(string +  a + v);
		
	}
	public static void foo(String string) {
		System.out.println(string);
		
	}
}
