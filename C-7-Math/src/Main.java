import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y);
		System.out.println(z);
		double q = Math.min(x, y);
		System.out.println(q);
		double ab = Math.abs(y);
		System.out.println(ab);
		double sq = Math.sqrt(x);
		System.out.println(sq);
		double rd = Math.round(x);
		System.out.println(rd);
		double cl = Math.ceil(x);
		System.out.println(cl);
		double fl = Math.floor(x);
		System.out.println(fl);
		*/
		
		double x, y, z;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is : "+z);
		
		scanner.close();
		
		
	}

}
