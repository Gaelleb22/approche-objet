package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

/**Classe exécutlable test des map
 * @author formation
 *
 */
public class CreationEtManipulationMap {
	
	public static void main(String args[]) {
		
		//création mapVille avec numéro de département et nom des villes
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Afficher les clés
		Iterator<Integer> keyIte = mapVilles.keySet().iterator();
		while(keyIte.hasNext()) {
			int cle = keyIte.next();
			System.out.println(cle);
		}
		
		//Afficher les valeurs
		Iterator<String> valueIte = mapVilles.values().iterator();
		while(valueIte.hasNext()) {
			String ville = valueIte.next();
			System.out.println(ville);
		}
		
		//Afficher taille de la map
		System.out.println(mapVilles.size());
		

	}
}