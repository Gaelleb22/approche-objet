package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestTriPays {

	public static void main(String[] args) {
		List <Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("USA", 332_639_000, 59_495));
        listePays.add(new Pays("France", 67_064_000, 43_551));
        listePays.add(new Pays("Allemagne", 83_149_300, 50_206));
        listePays.add(new Pays("UK", 66_436_000, 43_620));
        listePays.add(new Pays("Italie", 61_302_519, 37_970));
        listePays.add(new Pays("Japon", 126_010_000, 42_659));
        listePays.add(new Pays("Chine", 1_400_050_000, 16_624));
        listePays.add(new Pays("Russie", 146_748_590, 28_712));
        listePays.add(new Pays("Inde", 1_386_249_417, 5_174));
        
        //comparaison avec interface Comparable
        Collections.sort(listePays);
        
        //Comparaison avec Comparator
        Collections.sort(listePays, new ComparatorPibHabitant());
        
        Iterator<Pays> iterator1 = listePays.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}

}
