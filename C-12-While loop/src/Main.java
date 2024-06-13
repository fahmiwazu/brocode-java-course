import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String name ="";
		
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();	
		}

		System.out.print("Hello "+ name);
		
		
	}

}
