
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int x = add(1,2,3,4);
		double x = add(3.14,4.13);
		
		System.out.println(x);
		
	}
	
	static int add(int a, int b) {
		System.out.println("Method 1");
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("Method 2");
		return a+b+c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("Method 3");
		return a+b+c+d;
	}
	
	static double add(double a, double b) {
		System.out.println("Method 1");
		return a+b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("Method 2");
		return a+b+c;
	}
	
	static double add(double a, double b, double c, double d) {
		System.out.println("Method 3");
		return a+b+c+d;
	}

}
