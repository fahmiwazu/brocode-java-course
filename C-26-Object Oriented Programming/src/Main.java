
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car bemo = new Car();
		Car bemo2= new Car();
		
		System.out.println(bemo.make);
		System.out.println(bemo.model);
		System.out.println(bemo.color);
		System.out.println(bemo.year);
		System.out.println(bemo.price);

		bemo.drive();
		bemo.brake();
		
		System.out.println(bemo2.make);
		System.out.println(bemo.model);
		System.out.println(bemo.color);
		System.out.println(bemo.year);
		System.out.println(bemo.price);
		
		bemo.drive();
		bemo.brake();
	}

}
