package fr.diginamic.enumeration;

import java.util.HashSet;
import java.util.Set;

import fr.diginamic.sets.Pays;

public class TestPaysAvecEnum {

	public static void main(String[] args) {
		Set<Pays> setPays = new HashSet<Pays>();
		
		setPays.add(new Pays("USA", 332_639_000, 59_495, Continent.AMERIQUE));
		setPays.add(new Pays("France", 67_064_000, 43_551, Continent.EUROPE));
		setPays.add(new Pays("Allemagne", 83_149_300, 50_206, Continent.EUROPE));
		setPays.add(new Pays("UK", 66_436_000, 43_620, Continent.EUROPE));
		setPays.add(new Pays("Italie", 61_302_519, 37_970, Continent.EUROPE));
		setPays.add(new Pays("Japon", 126_010_000, 42_659, Continent.ASIE));
		setPays.add(new Pays("Chine", 1_400_050_000, 16_624, Continent.ASIE));
		setPays.add(new Pays("Russie", 146_748_590, 28_712, Continent.ASIE));
		setPays.add(new Pays("Inde", 1_386_249_417, 5_174, Continent.ASIE));
        
		int europe = 0;
	    int asie =0;
	    int amerique =0 ;
        for(Pays pays : setPays) {
        	System.out.println(pays);
        	if(pays.getContinent().equals(Continent.ASIE)) {
        		asie += 1;
        	}
        	else if(pays.getContinent().equals(Continent.AMERIQUE)) {
        		amerique += 1;
        	}
        	else if(pays.getContinent().equals(Continent.EUROPE)) {
        		europe += 1;
        	}
        }
        System.out.println("Europe : "+ europe);
        System.out.println("Amérique : "+ amerique);
        System.out.println("Asie : "+asie);

	}

}
