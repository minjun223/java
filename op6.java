package chap00;

public class op6 {

	public static void main(String[] args) {
		foo("æ»≥Á ", 1);
		foo("æ»≥Á«œººø‰ ", 1, 2);
		foo("¿ﬂ ¿÷æÓ");
	
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
