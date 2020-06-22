/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Classe permettant de trouver les 10 villes les plus peuplées d'un département donnéeS
 * @author formation
 *
 */
public class VillePlusPeupleParDep extends MenuService {

	@Override
	public void traiter(List<Ville> liste, Scanner scanner) {
		System.out.println("Entrez le numéro de département");
		String code = scanner.next();
		Departement departement = new Departement(liste, code);
		
		List<Ville> listeVilles = new ArrayList<>();
		listeVilles.addAll(departement.getVilleDuDepartement());
		
		// calcul des 10 villes les plus peuplées du département

		MethodePlusPeupleDe.DixPlusPeuple(listeVilles);

	}

}
