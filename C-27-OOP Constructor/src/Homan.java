
public class Homan {
	
	String name;
	int age;
	double height;

	Homan(String name, int age, double height){
		
		this.name = name;
		this.age = age;
		this.height = height;
		
	}
	
	void eat() {
		System.out.println(this.name + " sek mangan");
	}
	
	void sleep() {
		System.out.println(this.name + " sek turu");
	}
	
}
