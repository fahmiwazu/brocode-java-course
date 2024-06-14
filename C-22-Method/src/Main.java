
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Waz";
		int age = 28;
		Hello(name, age);
		
		int x = 3;
		int y = 4;
				
		System.out.println(add(x,y));
		
		
	}
	
	static void Hello(String text, int number) {
		System.out.println("Hello "+ text+ " your are "+ number);
	}
	
	static int add(int x, int y) {
		
		int z = x + y;
		return z;
	}

}
