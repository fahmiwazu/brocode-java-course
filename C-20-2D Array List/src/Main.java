import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Goreng = new ArrayList<String>();	
		Goreng.add("Tahu");
		Goreng.add("Tempe");
		Goreng.add("Pisang");
		
		ArrayList<String> Minum = new ArrayList<String>();
		Minum.add("soda");
		Minum.add("teh");
		Minum.add("kopi");
		
		ArrayList<String> Sambal = new ArrayList<String>();
		Sambal.add("Belut");
		Sambal.add("Bawang");
		Sambal.add("Terasi");
		
		ArrayList<ArrayList<String>> Warteg = new ArrayList();
		Warteg.add(Goreng);
		Warteg.add(Sambal);
		Warteg.add(Minum);
		
		System.out.println(Warteg);
		System.out.println(Warteg.get(0));
		System.out.println(Warteg.get(0).get(1));
	}

}
