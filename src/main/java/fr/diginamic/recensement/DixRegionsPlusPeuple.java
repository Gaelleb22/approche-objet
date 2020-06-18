/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author formation
 *
 */
public class DixRegionsPlusPeuple extends MenuService {

	@Override
	public void traiter(List<Ville> liste, Scanner scanner) {
		System.out.println("Les 10 régions les plus peuplée sont : ");

		// Création liste de toutes les région
		List<Region> listeRegion = new ArrayList<>();
		Set<String> nomsRegion = new HashSet<>();
		for (Ville ville : liste) {
			nomsRegion.add(ville.getNomRegion());
		}

		for (String nom : nomsRegion) {
			listeRegion.add(new Region(liste, nom));
		}

		// calcul des 10 régions les plus peuplées

		for (int i = 0; i < 10; i++) {
			Region maxHab = listeRegion.iterator().next();
			for (Region region : listeRegion) {
				if (maxHab.getPopulationTotale() < region.getPopulationTotale()) {
					maxHab = region;
				}
			}
			System.out.println(maxHab);
			listeRegion.remove(maxHab);
		}

	}

}
