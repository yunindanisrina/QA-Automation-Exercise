package javaprogram;
import java.util.TreeSet;

public class TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> favoriteFood = new TreeSet();
		favoriteFood.add("Risoles");
		favoriteFood.add("Donat");
		favoriteFood.add("Sus");
		favoriteFood.add("Lumpia");
		favoriteFood.add("Burger");
		
		System.out.println("List Favorite Food \t:"+ favoriteFood);
		System.out.println("Firt Favorite Food :"+ favoriteFood.first());
		System.out.println("Last Favorite Food :"+ favoriteFood.last());
		
		
	}

}
