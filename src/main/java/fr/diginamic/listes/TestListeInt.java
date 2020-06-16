package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> entiers = new ArrayList<>();
		entiers.add(-1);
		entiers.add(5);
		entiers.add(7);
		entiers.add(3);
		entiers.add(-2);
		entiers.add(4);
		entiers.add(8);
		entiers.add(5);
		
	
		System.out.println(entiers);
		System.out.println("taille : "+entiers.size());
		
		int max = Collections.max(entiers);
		System.out.println("Max = "+max);
		
		int indexMin = entiers.indexOf(Collections.min(entiers));
		entiers.remove(indexMin);
		System.out.println(entiers);
		
		for(Integer list : entiers) {
			if(list <0) {
				int indexNegatif = entiers.indexOf(list);
				entiers.set(indexNegatif, -list);
			}
		}
		System.out.println(entiers);
		
	}

}
