package chap07;

interface Animal{
	void sound();
}

class Dog implements Animal{
	public void sound() {
		System.out.println("¸Û¸Û~");
	}
}
class Cuckoo implements Animal{
	public void sound() {
		System.out.println("»µ±¹~");
	}
}
public class AnimalDEmo {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();
		
		makeSound(d);
		makeSound(c);

	}
	static void makeSound(Animal a) {
		a.sound();
	}
}
