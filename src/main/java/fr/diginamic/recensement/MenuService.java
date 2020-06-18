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
public abstract class MenuService {
	
	/**
	 * Méthode traiter
	 */
	public abstract void traiter(List<Ville> liste, Scanner scanner);

}
