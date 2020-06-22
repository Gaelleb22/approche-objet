/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**Classe permettant de trouver les 10 départements les plus peuplée de France
 * @author formation
 *
 */
public class DixDepartementPlusPeuple extends MenuService {

	@Override
	public void traiter(List<Ville> liste, Scanner scanner) {
		System.out.println("Les 10 départements les plus peuplée sont : ");

		// Création liste de tous les départements
		List<Departement> listeDep = new ArrayList<>();
		Set<String> codeDep = new HashSet<>();
		for (Ville ville : liste) {
			codeDep.add(ville.getCodeDepartement());
		}

		for (String code : codeDep) {
			listeDep.add(new Departement(liste, code));
		}

		// calcul des 10 départements les plus peuplées

		for (int i = 0; i < 10; i++) {
			Departement maxHab = listeDep.iterator().next();
			for (Departement departement : listeDep) {
				if (maxHab.getPopulationTotale() < departement.getPopulationTotale()) {
					maxHab = departement;
				}
			}
			System.out.println(maxHab);
			listeDep.remove(maxHab);

		}
	}

}
