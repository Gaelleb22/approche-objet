package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		String[] array = {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
		
		List<String> villes = new ArrayList<String>();
		villes.addAll(Arrays.asList(array));
		
		String villeNomPlusLong = villes.get(0);
		for(String ville : villes) {
			if(villeNomPlusLong.length()<ville.length()) {
				villeNomPlusLong = ville;
			}
		}
		System.out.println(villeNomPlusLong);
		
		for(int i=0; i<villes.size(); i++) {
			villes.set(i, villes.get(i).toUpperCase());
		}
		System.out.println(villes);
		
		Iterator <String> iterator = villes.iterator();
		while(iterator.hasNext()) {
			String nomVille = iterator.next();
			if(nomVille.startsWith("N")) {
				iterator.remove();
			}
		}
		System.out.println(villes);

	}

}
