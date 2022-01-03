package mine;

public class Object {

	public static void main(String[] args) {
		String [] strarray = new String[3];
		strarray[0] = "java";
		strarray[1] = "java";
		strarray[2] = new String("java");
		
		System.out.println(strarray[0] == strarray[1]);
		System.out.println(strarray[0] == strarray[2]);
		System.out.println(strarray[0].equals(strarray[2]) );
	}

}
