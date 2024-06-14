
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean bool = true;
		char ch = '@';
		String str = "Waz";
		int num = 33;
		double doub = 124123123.456;
		
		// Conversion Char
		System.out.printf("\nTHis is format %b", bool);
		System.out.printf("\nTHis is format %c", ch);
		System.out.printf("\nTHis is format %s", str);
		System.out.printf("\nTHis is format %d", num);
		System.out.printf("\nTHis is format %f", doub);

		// Width
		System.out.printf("\nTHis is format %10s", str);
		System.out.printf("\nTHis is format %-10s", str);
		
		// Precision
		System.out.printf("\nTHis is format %.2f", doub);
		
		// Flag
		System.out.printf("\nTHis is format %f", doub);
		System.out.printf("\nTHis is format %20f", doub);
		System.out.printf("\nTHis is format %+f", doub);
		System.out.printf("\nTHis is format %020f", doub);
		System.out.printf("\nTHis is format %,f", doub);
		
		
		
		
	}

}
