package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import fr.diginamic.sets.Pays;

/**Classe exécutive pour testes les map objet
 * @author formation
 *
 */
public class MapPays {

	public static void main(String[] args) {
		
		//création de la map
		Map<String, Pays> mapPays = new HashMap<>();
		mapPays.put("USA", new Pays("USA", 332_639_000, 59_495));
		mapPays.put("France", new Pays("France", 67_064_000, 43_551));
		mapPays.put("Allemagne", new Pays("Allemagne", 83_149_300, 50_206));
		mapPays.put("Uk", new Pays("UK", 66_436_000, 43_620));
		mapPays.put("Italie", new Pays("Italie", 61_302_519, 37_970));
		mapPays.put("Japon", new Pays("Japon", 126_010_000, 42_659));
		mapPays.put("Chine", new Pays("Chine", 1_400_050_000, 16_624));
		mapPays.put("Russie", new Pays("Russie", 146_748_590, 28_712));
		mapPays.put("Inde", new Pays("Inde", 1_386_249_417, 5_174));
		
		//rechercher et supprimer le pays le moins peuplé
		Iterator<String> keyIte = mapPays.keySet().iterator();
		Pays paysMoinsPeuple = mapPays.values().iterator().next();
		while(keyIte.hasNext()) {
			String key = keyIte.next();
			if(mapPays.get(key).getNbHabitant()<paysMoinsPeuple.getNbHabitant()) {
				paysMoinsPeuple = mapPays.get(key);
			}
		}
		mapPays.remove(paysMoinsPeuple.getNom());
		
		//Afficher les pays
		for(Pays pays : mapPays.values()) {
			System.out.println(pays);
		}

	}

}
