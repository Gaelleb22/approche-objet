package fr.diginamic.tri;

import java.util.Comparator;

/**Classe comparator par PIB par habitant pour la classe Pays
 * @author formation
 *
 */
public class ComparatorPibHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays pays1, Pays pays2) {
		if(pays1.getPibParHabitant()>pays2.getPibParHabitant()) {
			return 1;
		}
		else if(pays1.getPibParHabitant()<pays2.getPibParHabitant()) {
			return -1;
		}
		return 0;
	}

}
