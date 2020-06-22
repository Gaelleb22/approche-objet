package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**Classe exécutive test sur liste d'objet
 * @author formation
 *
 */
public class TestListeObjet {

	public static void main(String[] args) {
		
		//création d'une liste d'objet
		List <Ville> villes = new ArrayList<Ville>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));
		
		//recherche ville avec plus grand nombre d'habitants
		Ville plusGrande = villes.get(0);
		for(Ville ville : villes) {
			if(ville.getNombreHabitant()>plusGrande.getNombreHabitant()) {
				plusGrande=ville;
			}
		}
		System.out.println(plusGrande);
		
		//Supprimer la ville la moins peuplée
		Ville plusPetite = villes.get(0);
		for(Ville ville : villes) {
			if(ville.getNombreHabitant()<plusPetite.getNombreHabitant()) {
				plusPetite=ville;
			}
		}
		villes.remove(plusPetite);
		
		//villes de plus de 100 000 habitant en majuscule
		Iterator <Ville> iterator1 = villes.iterator();
		int index =-1;
		while(iterator1.hasNext()) {
			index++;
			if(iterator1.next().getNombreHabitant()>100000) {
				String majuscule = villes.get(index).getNom().toUpperCase();
				Ville villeMaj = new Ville(majuscule, villes.get(index).getNombreHabitant());
				villes.set(index, villeMaj);
			}
		}
		
		System.out.println(villes);

	}

}
