package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

/** Classe exécutable pour créer des listes
 *
 */
public class CreationListes {

	/**méthode main
	 */
	public static void main(String[] args) {
		List<Integer> entiers = new ArrayList<Integer>();
		
		for(int i=1; i<101; i++) {
			entiers.add(i);
		}
		System.out.println(entiers.size());

	}

}
