/**
 * 
 */
package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

/**Classe permettant de récupérer la population d'un département donnée
 * @author formation
 *
 */
public class PopulationDUnDepartement extends MenuService {

	@Override
	public void traiter(List<Ville> liste, Scanner scanner) {
		System.out.println("Entrez le numéro du département");
		String code = scanner.next();
		Departement departement = new Departement(liste, code);
		
		System.out.println( code + " : " + departement.getPopulationTotale() + " habitants");

	}

}
