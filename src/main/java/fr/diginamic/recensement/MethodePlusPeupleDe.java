/**
 * 
 */
package fr.diginamic.recensement;

import java.util.List;

/**
 * @author formation
 *
 */
public class MethodePlusPeupleDe {
	public static void DixPlusPeuple(List<Ville> liste) {
		for (int i = 0; i < 10; i++) {
			if (!liste.isEmpty()) {
				Ville maxHab = liste.iterator().next();
				for (Ville ville : liste) {
					if (maxHab.getPopulation() < ville.getPopulation()) {
						maxHab = ville;
					}
				}
				System.out.println(maxHab.getNomCommune());
				liste.remove(maxHab);
			}
		}
	}

}
