import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Cabe ijo");
		food.add("Nasgor");
		food.add("Tahu");
		
		food.set(0, "Sabana");
		food.remove(2);
		food.clear();
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
	}

}
