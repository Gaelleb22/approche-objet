/**
 * 
 */
package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

/**Classe permettant de calculer la population d'une région donnée
 * @author formation
 *
 */
public class PopulationDUneRegion extends MenuService {

	@Override
	public void traiter(List<Ville> liste, Scanner scanner) {
		System.out.println("Entrez le nom de la région");
		scanner.nextLine();
		String nom = scanner.nextLine();
		
		Region region = new Region(liste, nom);
		
		System.out.println( nom + " : " + region.getPopulationTotale() + " habitants");

	}

}
