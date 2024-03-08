package shirt_project;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		List<Shirt> a1=new ArrayList<>();
		
		Shirt s1=new Shirt("Blackberry", 40, 2300.5, "White");
		a1.add(s1);
		a1.add(new Shirt("Peter england", 38, 1800.3, "blue"));
		a1.add(new Shirt("Van Heusen", 42, 3200.3, "black"));
		a1.add(new Shirt("H&M", 40, 2400.3, "white"));
		System.out.println("Access All Shirts===============");
		ShirtManager.getAllShirt(a1);
		
		
	}

}
