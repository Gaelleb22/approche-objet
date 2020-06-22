package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**Classe exécutable pour tester les set de String
 * @author formation
 *
 */
public class TestSetString {

	public static void main(String[] args) {
		
		//Création set avec noms de pays
		String[] arrayPays = {"USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"};
		Set<String> setPays = new HashSet<String>();
		setPays.addAll(Arrays.asList(arrayPays));
		
		//rechercher le pays avec nom le plus long
		String paysPlusLong = "";
		for(String pays : setPays) {
			if(pays.length()>paysPlusLong.length()) {
				paysPlusLong = pays;
			}
		}
		System.out.println(paysPlusLong);
		
		//supprimer le résultat de la recherche
		setPays.remove(paysPlusLong);
		System.out.println(setPays);

	}

}
