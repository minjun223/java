package chap10;

import java.util.StringTokenizer;


public class unchecked1demo {
public static void main(String[] args) {
	String s = "JAva C Python";
	StringTokenizer st = new StringTokenizer(s);
	
	while (st.hasMoreElements()) {
		System.out.println(st.nextToken() +" + ");
	}
	System.out.println(st.nextToken());
}
}