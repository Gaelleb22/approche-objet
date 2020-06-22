package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**Classe exécutive test sur liste d'entiers
 * @author formation
 *
 */
public class TestListeInt {

	public static void main(String[] args) {
		
		//création liste d'entiers
		List<Integer> entiers = new ArrayList<>();
		entiers.add(-1);
		entiers.add(5);
		entiers.add(7);
		entiers.add(3);
		entiers.add(-2);
		entiers.add(4);
		entiers.add(8);
		entiers.add(5);
		
		//affichage liste
		System.out.println(entiers);
		
		//taille de la liste
		System.out.println("taille : "+entiers.size());
		
		//rechercher le plus grand élément
		int max = Collections.max(entiers);
		System.out.println("Max = "+max);
		
		//supprimer le plus petit élément
		int indexMin = entiers.indexOf(Collections.min(entiers));
		entiers.remove(indexMin);
		System.out.println(entiers);
		
		//mettre tous les éléments négatifs en positifs
		for(Integer list : entiers) {
			if(list <0) {
				int indexNegatif = entiers.indexOf(list);
				entiers.set(indexNegatif, -list);
			}
		}
		System.out.println(entiers);
		
	}

}
