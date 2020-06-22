package fr.diginamic.sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**Classe exécutable pour tester les set de double
 * @author formation
 *
 */
public class TestSetDouble {

	public static void main(String[] args) {
		
		//Création d'un set de double
		Double[] set = {1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01};
		Set<Double> setDouble = new HashSet<Double>();
		setDouble.addAll(Arrays.asList(set));
		System.out.println(setDouble);
		
		//rechercher l'élément le plus grand
		double max = Collections.max(setDouble);
		System.out.println(max);
		
		//supprimer l'élément le plus petit
		double min = Collections.min(setDouble);
		System.out.println(min);
		setDouble.remove(min);
		
		//afficher résultat
		System.out.println(setDouble);

	}

}
