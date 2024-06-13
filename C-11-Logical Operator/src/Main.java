import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp = 20;
		
		if(temp>30) {
			System.out.println("Panaz");
		}
		else if(temp >= 20 && temp<=30) {
			System.out.println("Pass");		
		}
		else {
			System.out.println("Adem");		
			
		}
		
		Scanner scanner = new Scanner(System.in);
		
		/// OR Operator
		System.out.println("press q to quit");			
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("quit");			
		}
		else {
			System.out.println("still in");			
		}
		
		// AND Operator
		System.out.println("press q to quit");			
		response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("still in");			
		}
		else {
			System.out.println("quit");			
		}
		
	}

}
