/**
 * 
 */
package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

/**Classe abstraite avec méthode traiter à implémenter pour chaque option du menu
 * @author formation
 *
 */
public abstract class MenuService {
	
	/**
	 * Méthode traiter
	 */
	public abstract void traiter(List<Ville> liste, Scanner scanner);

}
