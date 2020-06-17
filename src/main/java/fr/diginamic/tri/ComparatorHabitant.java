package fr.diginamic.tri;

import java.util.Comparator;

/**Classe comparator par habitant pour la classe Pays
 * @author formation
 *
 */
public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays pays1, Pays pays2) {
		return pays1.getNbHabitant()-pays2.getNbHabitant();
	}
	

}
