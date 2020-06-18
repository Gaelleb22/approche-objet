/**
 * 
 */
package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

/**
 * @author formation
 *
 */
public class PopulationDUneRegion extends MenuService {

	@Override
	public void traiter(List<Ville> liste, Scanner scanner) {
		System.out.println("Entrez le nom de la région");
		String nom = scanner.next();
		Region region = new Region(liste, nom);
		
		System.out.println( nom + " : " + region.getPopulationTotale() + " habitants");

	}

}
