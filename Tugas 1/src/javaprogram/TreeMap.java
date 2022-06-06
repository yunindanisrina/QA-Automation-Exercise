package javaprogram;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Map favoriteFood = new TreeMap();
		favoriteFood.put(5, "Nasi Goreng");
		favoriteFood.put(1, "Indomie");
		favoriteFood.put(4, "Sate");
		favoriteFood.put(2, "Gado - Gado");
		favoriteFood.put(3, "Bakso");
		
		System.out.println("TreeMap Element");
		System.out.println(favoriteFood);
		
	}

}
