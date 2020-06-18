/**
 * 
 */
package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

/**Population d'une ville donnée
 * @author formation
 *
 */
public class PopulationDUneVille extends MenuService {

	@Override
	public void traiter(List<Ville> liste, Scanner scanner) {
		System.out.println("Entrez le nom de la ville");
		String nom = scanner.next();
		
		
		String commune = null;
		int population = 0;
		
		for(Ville ville : liste) {
			if(nom.equals(ville.getNomCommune())) {
				commune =ville.getNomCommune();
				population = ville.getPopulation();
			}
		}
		
		System.out.println(commune+ " : "+population + " habitants");
		
	}


}
