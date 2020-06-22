package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**Classe exécutable pour tester les set d'objet
 * @author formation
 *
 */
public class TestSetObjet {

	public static void main(String[] args) {
		
		//Création set Pays
		Set<Pays> pays = new HashSet<Pays>();
				
		pays.add(new Pays("USA", 332_639_000, 59_495));
        pays.add(new Pays("France", 67_064_000, 43_551));
        pays.add(new Pays("Allemagne", 83_149_300, 50_206));
        pays.add(new Pays("UK", 66_436_000, 43_620));
        pays.add(new Pays("Italie", 61_302_519, 37_970));
        pays.add(new Pays("Japon", 126_010_000, 42_659));
        pays.add(new Pays("Chine", 1_400_050_000, 16_624));
        pays.add(new Pays("Russie", 146_748_590, 28_712));
        pays.add(new Pays("Inde", 1_386_249_417, 5_174));
		
		
		//PIB/hab le plus important :
		Pays pibParHabPlusGrand = new Pays(" ", 0, 0);
		for(Pays unPays : pays) {
			if(unPays.getPibParHabitant()>pibParHabPlusGrand.getPibParHabitant()) {
				pibParHabPlusGrand = unPays;
			}
		}
		
		//PIB total plus important :
		Pays pibTotalPlusGrand = new Pays(" ", 1, 1);
		for(Pays unPays : pays) {
			if(unPays.getPibTotal() > pibTotalPlusGrand.getPibTotal()) {
				pibTotalPlusGrand = unPays;
			}
		}
		
		//pib plus petit en maj
		Pays pibPlusPetit1 = pays.iterator().next();
		for(Pays unPays : pays) {
			if(unPays.getPibParHabitant() < pibPlusPetit1.getPibParHabitant()) {
				pibPlusPetit1 = unPays;
			}
		}
		pibPlusPetit1.setNom(pibPlusPetit1.getNom().toUpperCase());
		
		//PIB plus petit en majuscule
		Pays pibPlusPetit = pays.iterator().next();
		
		for(Pays unPays : pays) {
			if(unPays.getPibTotal() < pibPlusPetit.getPibTotal()) {
				pibPlusPetit = unPays;
			}
		}
		
		pays.remove(pibPlusPetit);
		
		//affichage du set
		Iterator<Pays> iterator1 = pays.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		

	}

}
