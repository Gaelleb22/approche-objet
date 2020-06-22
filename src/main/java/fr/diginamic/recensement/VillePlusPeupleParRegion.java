/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Classe pour rechercher les 10 villes les plus peuplée d'une région
 * @author formation
 *
 */
public class VillePlusPeupleParRegion extends MenuService {

	@Override
	public void traiter(List<Ville> liste, Scanner scanner) {
		System.out.println("Entrez le nom de la région");
		scanner.nextLine();
		String code = scanner.nextLine();
		Region region = new Region(liste, code);
		
		List<Ville> listeVilles = new ArrayList<>();
		listeVilles.addAll(region.getVilleRegion());
		
		// calcul des 10 ville les plus peuplée de la région
		MethodePlusPeupleDe.DixPlusPeuple(listeVilles);

	}

}
