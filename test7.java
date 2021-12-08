package chap10;

//
//class People<T, M>{
//	private T name;
//	private M age;
//	
//	People (T name, M age){
//		this.name=name;
//		this.age=age;
//	}
//
//	public T getName() {
//		return name;
//	}
//
//	public void setName(T name) {
//		this.name = name;
//	}
//
//	public M getAge() {
//		return age;
//	}
//
//	public void setAge(M age) {
//		this.age = age;
//		
//	public static <T,V> boolean compare(People<T,V>p1, People<T, v>p2) {
//		boolean nameCompare = p1.getName().equals(p2.getName());
//		boolean ageCompare  = p1.getAge().equals(p2.getAge());
//		return nameCompare && ageCompare;
//	}
//	}
//
//	public boolean compare(People<String, Integer> p1, People<String, Integer> p2) {
//		
//		return false;
//	}
//}
//public class test7 {
//
//	public static void main(String[] rags) {
//		People<String,Integer> p1 = new People<String, Integer>("Jack", 20);
//		People<String,Integer> p2 = new People("Jack", 30);
//		
//		boolean result = p1.compare(p1, p2);
//		
//		System.out.println(result);
//	}
//
//}
