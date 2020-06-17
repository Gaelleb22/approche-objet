package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		String[] arrayPays = {"USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"};
		Set<String> setPays = new HashSet<String>();
		setPays.addAll(Arrays.asList(arrayPays));
		
		String paysPlusLong = "USA";
		for(String pays : setPays) {
			if(pays.length()>paysPlusLong.length()) {
				paysPlusLong = pays;
			}
		}
		System.out.println(paysPlusLong);
		setPays.remove(paysPlusLong);
		System.out.println(setPays);

	}

}
