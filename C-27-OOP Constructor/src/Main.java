
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Homan homan1 = new Homan("Waz",28,77);
		Homan homan2 = new Homan("Sal",27,50);

		System.out.println(homan1.name);
		System.out.println(homan2.name);
		
		homan1.eat();
		homan2.sleep();
		
	}

}
