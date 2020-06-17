package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetObjet {

	public static void main(String[] args) {
		Set<Pays> pays = new HashSet<Pays>();
				
		pays.add(new Pays("USA", 332_639_000, 59_495));
        pays.add(new Pays("France", 67_064_000, 43_551));
        pays.add(new Pays("Allemagne", 83_149_300, 50_206));
        pays.add(new Pays("UK", 66_436_000, 43_620));
        pays.add(new Pays("Italie", 60_317_000, 37_970));
        pays.add(new Pays("Japon", 126_010_000, 42_659));
        pays.add(new Pays("Chine", 1_400_050_000, 16_624));
        pays.add(new Pays("Russie", 146_748_590, 28_712));
        pays.add(new Pays("Inde", 1_368_163_000, 5_174));
		
		System.out.println(pays);
		
		//PIB/hab le plus important :
		Pays pibParHabPlusGrand = new Pays(" ", 0, 0);
		for(Pays unPays : pays) {
			if(unPays.getPibParHabitant()>pibParHabPlusGrand.getPibParHabitant()) {
				pibParHabPlusGrand = unPays;
			}
		}
		System.out.println(pibParHabPlusGrand);
		
		//PIB total plus important :
		Pays pibTotalPlusGrand = new Pays(" ", 1, 1);
		for(Pays unPays : pays) {
			if(unPays.getPibParHabitant()*unPays.getNbHabitant() > pibTotalPlusGrand.getPibParHabitant()*pibTotalPlusGrand.getNbHabitant()) {
				pibTotalPlusGrand = unPays;
			}
		}
		System.out.println(pibTotalPlusGrand);
		
		//PIB plus petit en majuscule
		Pays pibPlusPetit = new Pays(" ", pibTotalPlusGrand.getNbHabitant(), pibTotalPlusGrand.getPibParHabitant());
		
		for(Pays unPays : pays) {
			if(unPays.getPibParHabitant()*unPays.getNbHabitant() < pibPlusPetit.getPibParHabitant()*pibPlusPetit.getNbHabitant()) {
				pibPlusPetit = unPays;
			}
		}
		
		Iterator<Pays> iterator1 = pays.iterator();
		while(iterator1.hasNext()) {
			Pays unPays = iterator1.next();
			if(unPays == pibPlusPetit) {
				unPays.setNom(pibPlusPetit.getNom().toUpperCase());
			}
		}
		pays.remove(pibPlusPetit);
		
		System.out.println(pays);

	}

}
