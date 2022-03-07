package test1;

class Person{
	int com =1;
	String name = "È«±æµ¿";
	void whoami() {
		System.out.println("»ç¶÷");
	}
	static void like() {
		System.out.println("eat");
	}
}

class Student extends Person{
	String name = "Áø";
	void move() {
		System.out.println("walk");
	}
	void whoami() {
		System.out.println("ÇÐ»ý");
	}
	static void like() {
		System.out.println("study");
	}
}
class Teacher extends Person{
	String name = "±è±³»ç";
	void move() {
		System.out.println("car");
	}
	void whoami() {
		System.out.println("¼±»ý´Ô");
	}
	static void like() {
		System.out.println("teach");
	}
}
public class Ex1 {

	public static void main(String[] args) {
//		Student s = new Student();
//		System.out.println(s.com);
//		System.out.println(s.name);
//		s.move();
//		s.whoami();
//		Student.like();
//		Person p1 = new Student();
//		System.out.println(p1.com);
//		System.out.println(p1.name);
//		p1.move();
//		p1.whoami();
//		Person.like();
//		Person p2 = new Teacher();
//		System.out.println(p2.com);
//		System.out.println(p2.name);
//		p2.whoami();
//		p2.like();
//		Student s1 = new Student();
//		Person p = s1;
//		Student s2 = (Student)p;
//		
//		System.out.println(s2.com);
//		System.out.println(s2.name);
//		s2.move();
//		s2.whoami();
//		s2.like();
		Student s =new Student();
		Person p = new Person();
		
		System.out.println(p instanceof Student);
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Student);
		p=s;
		System.out.println(p instanceof Student);

	}

}
