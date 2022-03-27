package _10_14;

class Person{
	int age;
	String name;
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	void show() {
		System.out.println("사람[이름 : " + name + ", 나이 :" + age);
	}
}
class Student extends Person{
	int classnum;
	public Student(String name, int age, int classnum) {
		super(name, age);
		this.classnum = classnum;
	}
	void show() {
		System.out.println("사람[이름 : " + name + ", 나이 :" + age + ", 학번 : "+ classnum);
	}
}
class ForeignStudent extends Student{
	String country;
	public ForeignStudent(String name, int age, int classnum, String country) {
		super(name, age, classnum);
		this.country = country;
	}
	
	void show() {
		System.out.println("사람[이름 : " + name + ", 나이 :" + age + ", 학번 : "+ classnum + ", 국적" + country);
	}
}
public class StudentTest {

	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0] = new Person("길동이", 22);
		p[1] = new Student("황진이", 23, 100);
		p[2]= new ForeignStudent("Amy", 30, 200, "U.S.A");
		
		for(Person i: p)
			i.show();
	}

}
