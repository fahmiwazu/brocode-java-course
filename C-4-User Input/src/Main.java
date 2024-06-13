
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();	
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();	
		scanner.nextLine();	
		
		System.out.println("fav food? ");
		String food = scanner.nextLine();	
		
		
		System.out.println("Hello "+ name);
		System.out.println("you are "+ age);
		System.out.println("you like "+ food);
		
		
	
	}

}
