package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**Classe exécutive test de fusion de listes
 * @author formation
 *
 */
public class FusionListe {

	public static void main(String args[]) {
		
		//liste 1
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		//liste2
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		//liste 3 = fusion de liste 1 et 2
		List<String> liste3 = new ArrayList<String>();
		Iterator <String> iterator = liste1.iterator();
		while(iterator.hasNext()) {
			liste3.add(iterator.next()+" et "+liste2.iterator().next());
		}
		System.out.println(liste3);

	}
}